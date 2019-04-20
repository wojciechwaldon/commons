package com.wojciechwaldon.commons.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wojciechwaldon.commons.Converter;

public class ObjectToJsonConverter implements Converter<Object, String> {

    public String convert(Object object) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
