package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PluginEntityType implements EnumValueProvider<Short> {
    Plan((short) 0),
    Description((short) 1);

    private final Short value;

    PluginEntityType(Short value) {
        this.value = value;
    }

    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, PluginEntityType> map = EnumUtils.getEnumValueMap(PluginEntityType.class);

    public static PluginEntityType of(Short i) {
        return map.get(i);
    }
}

