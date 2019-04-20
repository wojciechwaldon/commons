package com.wojciechwaldon.commons.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wojciechwaldon.commons.ExtendedConverter;

public class JsonToObjectConverter<T> implements ExtendedConverter<String, T, Class> {

    public T convert(String json, Class clazz) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();
            //noinspection unchecked
            return (T) mapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
