package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PlanBlueprintStatus implements EnumValueProvider<Short> {

    Draft((short) 0),
    Finalized((short) 1);

    private final Short value;

    PlanBlueprintStatus(Short value) {
        this.value = value;
    }

    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, PlanBlueprintStatus> map = EnumUtils.getEnumValueMap(PlanBlueprintStatus.class);

    public static PlanBlueprintStatus of(Short i) {
        return map.get(i);
    }

}
