package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum SystemFieldType implements EnumValueProvider<Short> {

    PlanTitle((short)0),
    PlanDescription((short)1),
    PlanLanguage((short)2),
    PlanContact((short)3),
    PlanAccessRights((short)4),
    PlanUser((short)5),
    DescriptionTitle((short)100),
    DescriptionDescription((short)101),
    DescriptionTag((short)102);
    private final Short value;

    SystemFieldType(Short value) {
        this.value = value;
    }

    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, SystemFieldType> map = EnumUtils.getEnumValueMap(SystemFieldType.class);

    public static SystemFieldType of(Short i) {
        return map.get(i);
    }
}
