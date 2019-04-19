package com.wojciechwaldon.commons;

import java.util.List;
import java.util.stream.Collectors;

public interface Converter<T, S> {

    S convert(T object);

    default List<S> convert(List<T> objects) {
        return objects.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
