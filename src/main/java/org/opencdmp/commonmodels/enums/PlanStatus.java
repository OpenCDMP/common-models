package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PlanStatus implements EnumValueProvider<Short> {

    Draft((short) 0), Finalized((short) 1);

    private final Short value;

    PlanStatus(Short value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, PlanStatus> map = EnumUtils.getEnumValueMap(PlanStatus.class);

    public static PlanStatus of(Short i) {
        return map.get(i);
    }


}

