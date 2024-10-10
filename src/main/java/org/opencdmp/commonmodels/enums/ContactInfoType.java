package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum ContactInfoType implements EnumValueProvider<Short> {

    Email((short) 0);

    private final Short value;

    ContactInfoType(Short value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, ContactInfoType> map = EnumUtils.getEnumValueMap(ContactInfoType.class);

    public static ContactInfoType of(Short i) {
        return map.get(i);
    }

}
