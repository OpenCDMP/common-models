package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum ReferenceTypeFieldDataType implements EnumValueProvider<Short> {
    Text((short) 0),
    Date((short) 1);

    private final Short value;

    ReferenceTypeFieldDataType(Short value) {
        this.value = value;
    }

    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, ReferenceTypeFieldDataType> map = EnumUtils.getEnumValueMap(ReferenceTypeFieldDataType.class);

    public static ReferenceTypeFieldDataType of(Short i) {
        return map.get(i);
    }
}
