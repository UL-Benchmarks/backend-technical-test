package com.ul.benchmarks.programmingtest.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.io.InputStream;

public class JsonUtil {

    private final static ObjectMapper mapperInstance = getCommonMapper(false);

    private static ObjectMapper getCommonCommonMapper(boolean retainOrder) {
        ObjectMapper commonMapper = new ObjectMapper();
        commonMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        commonMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        commonMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        if (!retainOrder) {
            commonMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
        }
        commonMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        return commonMapper;
    }

    private static ObjectMapper getCommonMapper(boolean retainOrder) {
        ObjectMapper commonMapper = getCommonCommonMapper(retainOrder);
        return commonMapper;
    }

    public static <T> T deserializeOrThrow(InputStream stream, Class<T> typeReference) {
        try {
            return mapperInstance.readValue(stream, typeReference);
        } catch (IOException ioe) {
            throw new RuntimeException("deserialize of " + typeReference + " failed from " + stream, ioe);
        }
    }
}
