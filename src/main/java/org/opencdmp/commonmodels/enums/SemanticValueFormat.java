package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

/**
 * The form a plugin needs a semantic key's value in. Editors use it to tell authors when an input cannot give a
 * value the plugin keeps (a free-text size where a whole number is needed, a date where a date-time is).
 */
public enum SemanticValueFormat implements EnumValueProvider<Short> {
	Text((short) 0),
	/** A date, e.g. 2026-03-04. */
	Date((short) 1),
	/** A date and time, e.g. 2026-03-04T05:06:07Z. */
	DateTime((short) 2),
	Uri((short) 3),
	Email((short) 4),
	/** A whole number. */
	Integer((short) 5),
	Number((short) 6),
	/** true or false. */
	Boolean((short) 7),
	/** One of {@code SemanticKeyUsage#getValues()}, compared exactly. */
	Choice((short) 8),
	/** A two-letter ISO 639-1 language code, e.g. en. */
	LanguageTwoLetter((short) 9),
	/** A three-letter ISO 639-3 language code, e.g. eng. */
	LanguageThreeLetter((short) 10),
	/** A two-letter ISO 3166-1 country code, e.g. PT. */
	CountryCode((short) 11),
	/** A three-letter ISO 4217 currency code, e.g. EUR. */
	CurrencyCode((short) 12),
	/** A media type, e.g. text/csv. */
	MimeType((short) 13),
	/** A reference input: the picked reference's own fields supply the values (see {@code SemanticObject#isFromReference()}). */
	Reference((short) 14);

	private final Short value;

	SemanticValueFormat(Short value) {
		this.value = value;
	}

	@JsonValue
	public Short getValue() {
		return value;
	}

	private static final Map<Short, SemanticValueFormat> map = EnumUtils.getEnumValueMap(SemanticValueFormat.class);

	public static SemanticValueFormat of(Short i) {
		return map.get(i);
	}
}
