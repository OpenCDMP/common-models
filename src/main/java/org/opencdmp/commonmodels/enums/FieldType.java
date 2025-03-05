package org.opencdmp.commonmodels.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum FieldType implements EnumValueProvider<String> {
    SELECT(Names.Select),
    BOOLEAN_DECISION(Names.BooleanDecision),
    RADIO_BOX(Names.RadioBox),
    INTERNAL_ENTRIES_PlANS(Names.InternalEntitiesPlans),
    INTERNAL_ENTRIES_DESCRIPTIONS(Names.InternalEntitiesDescriptions),
    CHECK_BOX(Names.CheckBox),
    FREE_TEXT(Names.FreeText),
    TEXT_AREA(Names.TextArea),
    RICH_TEXT_AREA(Names.RichTextarea),
    UPLOAD(Names.Upload),
    DATE_PICKER(Names.DatePicker),
    TAGS(Names.Tags),
    REFERENCE_TYPES(Names.ReferenceTypes),
    DATASET_IDENTIFIER(Names.DatasetIdentifier),
    VALIDATION(Names.Validation);
    private final String value;

    public static class Names {
        public static final String Select = "select";
        public static final String BooleanDecision = "booleanDecision";
        public static final String RadioBox = "radiobox";
        public static final String InternalEntitiesPlans = "internalEntitiesPlans";
        public static final String InternalEntitiesDescriptions = "internalEntitiesDescriptions";
        public static final String CheckBox = "checkBox";
        public static final String FreeText = "freetext";
        public static final String TextArea = "textarea";
        public static final String RichTextarea = "richTextarea";
        public static final String Upload = "upload";
        public static final String DatePicker = "datePicker";
        public static final String Tags = "tags";
        public static final String DatasetIdentifier = "datasetIdentifier";
        public static final String Validation = "validation";
        public static final String ReferenceTypes = "referenceTypes";
    }

    FieldType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    private static final Map<String, FieldType> map = EnumUtils.getEnumValueMap(FieldType.class);

    public static FieldType of(String i) {
        return map.get(i);
    }


}

