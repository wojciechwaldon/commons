package com.wojciechwaldon.commons;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter implements Converter<Object, String> {

    public String convert(Object object) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
