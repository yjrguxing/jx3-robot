package com.jx3robot.robot.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jx3robot.robot.dao.JX3MacroDao;
import com.jx3robot.robot.entity.JX3Macro;
import com.jx3robot.robot.entity.JX3MacroTalent;
import com.jx3robot.robot.service.JX3BPSDuJingService;
import com.jx3robot.robot.util.Const;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 剑三毒经业务逻辑层
 * @author psyduck
 * @Date 2022/6/8 20:42
 * @see
 * @version 1.0
 **/
@Service
public class JX3BPSDuJingServiceImpl implements JX3BPSDuJingService {

    private final JX3MacroDao jx3MacroDao;

    @Autowired
    public JX3BPSDuJingServiceImpl(JX3MacroDao jx3MacroDao){
        this.jx3MacroDao = jx3MacroDao;
    }
    @SneakyThrows
    @Override
    public String getDuJingMacro(String childMacroName) {
        ObjectMapper mapper = new ObjectMapper();
        String macroContent = jx3MacroDao.getMacro("18608");
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
            if(childMacroName.equals(jx3Macro.getName())){
                if (!"".equals(jx3Macro.getName())) {
                    msg += "\n" + "云端宏编码:" + author + "#" + jx3Macro.getName() + "\n";
                }
                if (!"".equals(jx3Macro.getMacro())) {
                    msg += jx3Macro.getMacro() + "\n";
                }
                JX3MacroTalent talent = jx3Macro.getTalent();
                if(talent != null){
                    String qxJson;
                    if("".equals(Const.CommonHashMap.qxJsonMap.get(talent.getVersion()))){
                        qxJson = jx3MacroDao.getMacroTalent(talent.getVersion());
                        Const.CommonHashMap.qxJsonMap.put(talent.getVersion(),qxJson);
                    }else {
                        qxJson = Const.CommonHashMap.qxJsonMap.get(talent.getVersion());
                    }
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
        }
        msg += author + "——" + postTitle + "\n";
        msg += "jx3box原文地址:"+ "https://www.jx3box.com/macro/18608";
        return msg;
    }
}
