package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum DataType implements EnumValueProvider<Short> {
	String((short) 0),
	File((short) 1),
	Boolean((short) 2),
	Select((short) 3),
	Color((short) 4),
	Number((short) 5),
	/** Multi-line text, e.g. lists of settings. */
	TextArea((short) 6),
	/**
	 * Some of the field's options, in an order the user picks; stored as {@code "a, b=Renamed, c"}: option values
	 * separated by commas, each optionally followed by {@code =} and a label replacing the option's own.
	 */
	OrderedList((short) 7),
	/**
	 * Texts replacing built-in ones; stored as {@code "key=text; key2=text"}. The options list the keys, with the
	 * built-in text as their label.
	 */
	KeyValue((short) 8),
	/**
	 * Which details to show per reference type, in order; stored as {@code "type:field,field; type2:field"}, with
	 * types and fields taken from the platform's reference type definitions.
	 */
	ReferenceTypeFields((short) 9);

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