package org.opencdmp.commonmodels.models.referencetype;

import org.opencdmp.commonmodels.enums.ReferenceTypeFieldDataType;

import java.util.List;

public class ReferenceTypeFieldModel {
    private String code;

    private String label;

    private String description;

    private ReferenceTypeFieldDataType dataType;

    private List<String> semantics;

    private Boolean required;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReferenceTypeFieldDataType getDataType() {
        return dataType;
    }

    public void setDataType(ReferenceTypeFieldDataType dataType) {
        this.dataType = dataType;
    }

    public List<String> getSemantics() {
        return semantics;
    }

    public void setSemantics(List<String> semantics) {
        this.semantics = semantics;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
