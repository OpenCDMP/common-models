package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

/** How much a plugin depends on a semantic key it reads. Neither level makes the key required by OpenCDMP. */
public enum SemanticKeyLevel implements EnumValueProvider<Short> {
	/** The plugin cannot do its job, or leaves out something its standard requires, without it. */
	Needs((short) 0),
	/** The plugin gives a richer result with it; fine to leave out. */
	CanUse((short) 1);

	private final Short value;

	SemanticKeyLevel(Short value) {
		this.value = value;
	}

	@JsonValue
	public Short getValue() {
		return value;
	}

	private static final Map<Short, SemanticKeyLevel> map = EnumUtils.getEnumValueMap(SemanticKeyLevel.class);

	public static SemanticKeyLevel of(Short i) {
		return map.get(i);
	}
}
