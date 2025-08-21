package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum DataType implements EnumValueProvider<Short> {
	String((short) 0),
	File((short) 1);

	private final Short value;
	private static final Map<Short, DataType> map = EnumUtils.getEnumValueMap(DataType.class);

	private DataType(Short value) {
		this.value = value;
	}

	@JsonValue
	public Short getValue() {
		return this.value;
	}

	public static DataType of(Short i) {
		return (DataType)map.get(i);
	}
}