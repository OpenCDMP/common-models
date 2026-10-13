package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PreviewFieldSource implements EnumValueProvider<Short> {
	Mapped((short) 0),
	Manual((short) 1),
	System((short) 2);

	private final Short value;
	private static final Map<Short, PreviewFieldSource> map = EnumUtils.getEnumValueMap(PreviewFieldSource.class);

	private PreviewFieldSource(Short value) {
		this.value = value;
	}

	@JsonValue
	public Short getValue() {
		return this.value;
	}

	public static PreviewFieldSource of(Short i) {
		return (PreviewFieldSource)map.get(i);
	}
}
