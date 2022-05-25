package com.ruoyi.robot.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.robot.dao.JX3BPSMoWenDao;
import com.ruoyi.robot.service.JX3BPSMoWenService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JX3BPSMoWenServiceImpl implements JX3BPSMoWenService {

    private final JX3BPSMoWenDao dao;

    @Autowired
    public JX3BPSMoWenServiceImpl(JX3BPSMoWenDao dao){
        this.dao = dao;
    }

    @SneakyThrows
    @Override
    public String getMoWenCalculatorContent() {
        String CalculatorVersion = null;
        String moWenCalculatorContent = dao.getMoWenCalculatorContent();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode dataNode = mapper.readTree(moWenCalculatorContent).get("data");
        String postTitle = dataNode.get("post_title").asText();
        if(postTitle.indexOf(">") - postTitle.indexOf("<") < 10 &&
            "更新至".equals(postTitle.substring(postTitle.indexOf("<") + 1,postTitle.indexOf("<") + 4))){
            CalculatorVersion = postTitle.substring(postTitle.indexOf("<") + 4, postTitle.indexOf(">"));
        }

        return CalculatorVersion;
    }
}
