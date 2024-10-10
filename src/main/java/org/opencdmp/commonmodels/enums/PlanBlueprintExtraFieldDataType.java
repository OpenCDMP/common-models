package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PlanBlueprintExtraFieldDataType implements EnumValueProvider<Short> {

    Text((short) 0),
    RichTex((short) 1),
    Date((short) 2),
    Number((short) 3),
    ;

    private final Short value;

    PlanBlueprintExtraFieldDataType(Short value) {
        this.value = value;
    }

    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, PlanBlueprintExtraFieldDataType> map = EnumUtils.getEnumValueMap(PlanBlueprintExtraFieldDataType.class);

    public static PlanBlueprintExtraFieldDataType of(Short i) {
        return map.get(i);
    }

}
