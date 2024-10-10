package org.opencdmp.commonmodels.models.description;

import java.util.Map;

public class PropertyDefinitionFieldSetItemModel {

    private Map<String, FieldModel> fields;

    private Integer ordinal;

    public Map<String, FieldModel> getFields() {
        return fields;
    }

    public void setFields(Map<String, FieldModel> fields) {
        this.fields = fields;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }
}
