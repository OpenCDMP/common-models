package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PlanUserRole implements EnumValueProvider<Short> {

    Owner((short) 0),
    Viewer((short) 1),
    DescriptionContributor((short) 2),
    Reviewer((short) 3),
    DataSteward((short) 4),
    DataPrivacyOfficer((short) 5),
    EthicsReviewer((short) 6);

    private final Short value;

    PlanUserRole(Short value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public Short getValue() {
        return value;
    }

    private static final Map<Short, PlanUserRole> map = EnumUtils.getEnumValueMap(PlanUserRole.class);

    public static PlanUserRole of(Short i) {
        return map.get(i);
    }

}
