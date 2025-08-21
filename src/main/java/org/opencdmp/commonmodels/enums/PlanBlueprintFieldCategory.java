package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PlanBlueprintFieldCategory implements EnumValueProvider<Short> {
    System((short) 0),
    Extra((short) 1),
    ReferenceType((short) 2),
    Upload((short) 3);

    public static class Names {
        public static final String System = "system";
        public static final String Extra = "extra";
        public static final String ReferenceType = "referenceType";
    }

    private final Short value;

    PlanBlueprintFieldCategory(Short value) {
        this.value = value;
    }

    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, PlanBlueprintFieldCategory> map = EnumUtils.getEnumValueMap(PlanBlueprintFieldCategory.class);

    public static PlanBlueprintFieldCategory of(Short i) {
        return map.get(i);
    }
}

