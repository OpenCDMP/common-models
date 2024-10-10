package org.opencdmp.commonmodels.enums;

import java.util.Map;

public enum ReferenceSourceType implements EnumValueProvider<Short> {

    Internal((short) 0),
    External((short) 1);

    private final Short value;

    ReferenceSourceType(Short value) {
        this.value = value;
    }

    @Override
    public Short getValue() {
        return value;
    }

    private static final Map<Short, ReferenceSourceType> map = EnumUtils.getEnumValueMap(ReferenceSourceType.class);

    public static ReferenceSourceType of(Short i) {
        return map.get(i);
    }
}
