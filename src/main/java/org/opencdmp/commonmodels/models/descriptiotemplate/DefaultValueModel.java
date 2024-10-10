package org.opencdmp.commonmodels.models.descriptiotemplate;

import java.time.Instant;

public class DefaultValueModel {

    private String textValue;

    private Instant dateValue;

    private Boolean booleanValue;

    public String getTextValue() {
        return this.textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Instant getDateValue() {
        return this.dateValue;
    }

    public void setDateValue(Instant dateValue) {
        this.dateValue = dateValue;
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }
}

