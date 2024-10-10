package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public interface EnumValueProvider<T> {
    @JsonValue
    T getValue();
}
