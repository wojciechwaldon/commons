package com.wojciechwaldon.commons;

import java.util.List;
import java.util.stream.Collectors;

public interface ExtendedConverter<S, U, V> {

    U convert(S parameter, V secondParameter);

    default List<U> convert(List<S> parameter, V secondParameter) {
        return parameter.stream()
                .map(p -> this.convert(p, secondParameter))
                .collect(Collectors.toList());
    }
}
