package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum PreviewFieldType implements EnumValueProvider<Short> {
	Text((short) 0),
	TextArea((short) 1),
	Date((short) 2),
	Select((short) 3),
	Tags((short) 4),
	Boolean((short) 5),
	Number((short) 6),
	ReadOnly((short) 7);

	private final Short value;
	private static final Map<Short, PreviewFieldType> map = EnumUtils.getEnumValueMap(PreviewFieldType.class);

	private PreviewFieldType(Short value) {
		this.value = value;
	}

	@JsonValue
	public Short getValue() {
		return this.value;
	}

	public static PreviewFieldType of(Short i) {
		return (PreviewFieldType)map.get(i);
	}
}
