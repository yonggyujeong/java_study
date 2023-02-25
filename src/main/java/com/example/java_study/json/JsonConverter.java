package com.example.java_study.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonConverter {

    public static String convert(Object object) {
        String jsonData = "";
        try {
            jsonData = new ObjectMapper().writeValueAsString(object);
            log.info(jsonData);
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        return jsonData;
    }
}
