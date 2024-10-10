package org.opencdmp.commonmodels.models.description;

import java.util.Map;

public class PropertyDefinitionModel {
    private Map<String, PropertyDefinitionFieldSetModel> fieldSets;

    public Map<String, PropertyDefinitionFieldSetModel> getFieldSets() {
        return fieldSets;
    }

    public void setFieldSets(Map<String, PropertyDefinitionFieldSetModel> fieldSets) {
        this.fieldSets = fieldSets;
    }
}

