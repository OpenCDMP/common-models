package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum FieldValidationType implements EnumValueProvider<Short> {

	None((short) 0),
	Required((short) 1),
	Url((short) 2);

	private final Short value;

	FieldValidationType(Short value) {
		this.value = value;
	}

	@JsonValue
	public Short getValue() {
		return value;
	}

	private static final Map<Short, FieldValidationType> map = EnumUtils.getEnumValueMap(FieldValidationType.class);

	public static FieldValidationType of(Short i) {
		return map.get(i);
	}

}
