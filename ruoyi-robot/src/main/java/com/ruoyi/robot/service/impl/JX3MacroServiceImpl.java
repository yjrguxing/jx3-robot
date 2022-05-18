package com.ruoyi.robot.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.robot.dao.JX3MacroDao;
import com.ruoyi.robot.entity.JX3Macro;
import com.ruoyi.robot.entity.JX3MacroMenu;
import com.ruoyi.robot.entity.JX3MacroTalent;
import com.ruoyi.robot.service.JX3MacroService;
import com.ruoyi.robot.util.Const;
import lombok.SneakyThrows;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 剑三宏业务逻辑层
 * @author psyduck
 * @Date 2022/5/17 14:02
 * @see
 * @version 1.0
 **/
@Service
public class JX3MacroServiceImpl implements JX3MacroService {

    private final JX3MacroDao dao;

    @Autowired
    public JX3MacroServiceImpl(JX3MacroDao dao){
        this.dao = dao;
    }

    @Override
    public String getMacro(String macroId) {
        return dao.getMacro(macroId);
    }

    @Override
    public String getMacroRec() {
        return dao.getMacroRec();
    }

    @Override
    public String getMacroTalent(String version) {
        return dao.getMacroTalent(version);
    }

    @SneakyThrows
    @Override
    public Message macroCommon(String macroName) {
        // 相应宏的图标Id
        String iconId = Const.CommonHashMap.bpsHashMap.get(macroName);
        // 宏菜单
        String macroRec = getMacroRec();
        // 获取宏菜单list
        ObjectMapper mapper = new ObjectMapper();
        JsonNode menusNode = mapper.readTree(macroRec).get("data").get("menu_group").get("menus");
        ArrayList<JX3MacroMenu> jx3MacroMenus = new ArrayList<>();
        for(JsonNode menuNode:menusNode){
            JX3MacroMenu jx3MacroMenu = mapper.treeToValue(menuNode, JX3MacroMenu.class);
            jx3MacroMenus.add(jx3MacroMenu);
        }
        // 在宏菜单中寻找心法ID正确的宏
        String macroId = null;
        for(JX3MacroMenu jx3MacroMenu:jx3MacroMenus){
            if(iconId.equals(jx3MacroMenu.getIcon())){
                macroId = jx3MacroMenu.getLink().split("/")[2];
            }
        }
        if(macroId == null){
            System.out.println("程序内定义的心法图标ID常量可能与魔盒中的心法图标ID不一致或魔盒内缺少相应心法的宏！");
            return Text.of("没有相应宏信息哦！");
        }
        //宏具体信息
        String macroContent = getMacro(macroId);
        JsonNode macroListNode = mapper.readTree(macroContent).get("data").get("post_meta").get("data");
        ArrayList<JX3Macro> jx3Macros = new ArrayList<>();
        for(JsonNode marcroNode:macroListNode){
            JX3MacroTalent talent = null;
            JsonNode talentNode = mapper.readTree(marcroNode.get("talent").asText());
            if (!talentNode.isEmpty()) {
                talent = mapper.treeToValue(talentNode, JX3MacroTalent.class);
            }
            JX3Macro jx3Macro = JX3Macro.builder()
                    .icon(mapper.treeToValue(marcroNode.get("icon"), String.class))
                    .name(mapper.treeToValue(marcroNode.get("name"), String.class))
                    .desc(mapper.treeToValue(marcroNode.get("desc"), String.class))
                    .equip(mapper.treeToValue(marcroNode.get("equip"), String.class))
                    .macro(mapper.treeToValue(marcroNode.get("macro"), String.class))
                    .talent(talent)
                    .equip_type(mapper.treeToValue(marcroNode.get("equip_type"), String.class))
                    .build();

            jx3Macros.add(jx3Macro);
        }
        String msg = "";

        String author = mapper.readTree(macroContent).get("data").get("author").asText();
        String postTitle = mapper.readTree(macroContent).get("data").get("post_title").asText();
        for(JX3Macro jx3Macro:jx3Macros){
            if (!"".equals(jx3Macro.getName())) {
                msg += "\n" + "云端宏编码:" + author + "#" + jx3Macro.getName() + "\n";
            }
            if (!"".equals(jx3Macro.getMacro())) {
                msg += jx3Macro.getMacro() + "\n";
            }
            JX3MacroTalent talent = jx3Macro.getTalent();
            if(talent != null){
                String qxJson = getMacroTalent(talent.getVersion());
                JsonNode qxJsonNode = mapper.readTree(qxJson).get(talent.getXf());
                String[] sqSplit = talent.getSq().split(",");
                msg += "[";
                for(int i = 0;i < qxJsonNode.size();i++){
                    JsonNode qxTempNode = qxJsonNode.get(""+ (i + 1));
                    msg += qxTempNode.get(sqSplit[i]).get("name").asText();
                    if (i != qxJsonNode.size() - 1) {
                        msg += ",";
                    }
                }
                msg += "]\n";
            }
        }
        msg += author + "——" + postTitle + "\n";
        msg += "jx3box原文地址:"+ "https://www.jx3box.com/macro/" + macroId;
        return Text.of(msg);
    }
}
