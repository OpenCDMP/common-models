package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PluginType implements EnumValueProvider<Short> {
    FileTransformer((short) 0),
    Deposit((short) 1),
    Evaluation((short) 2);

    private final Short value;

    PluginType(Short value) {
        this.value = value;
    }

    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, PluginType> map = EnumUtils.getEnumValueMap(PluginType.class);

    public static PluginType of(Short i) {
        return map.get(i);
    }
}

