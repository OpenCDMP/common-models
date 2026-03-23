package org.opencdmp.commonmodels.models.reference;

import org.opencdmp.commonmodels.enums.ReferenceTypeFieldDataType;

public class ReferenceFieldModel {

    private String code;
    private ReferenceTypeFieldDataType dataType;
    private String value;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ReferenceTypeFieldDataType getDataType() {
        return dataType;
    }

    public void setDataType(ReferenceTypeFieldDataType dataType) {
        this.dataType = dataType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
