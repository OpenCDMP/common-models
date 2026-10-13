package org.opencdmp.commonmodels.models.deposit;

import java.time.Instant;
import java.util.List;

/**
 * A single field value keyed by the field code of a {@link PreviewField}.
 * Used both to carry the current (prefilled) value inside a preview descriptor
 * and to submit user-edited values back with a deposit request. Exactly one of
 * the typed value slots is expected to be set, matching the field's type.
 */
public class PreviewFieldValue {
    private String code;
    private String textValue;
    private List<String> textListValue;
    private Boolean booleanValue;
    private Double numberValue;
    private Instant dateValue;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public List<String> getTextListValue() {
        return textListValue;
    }

    public void setTextListValue(List<String> textListValue) {
        this.textListValue = textListValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Double getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(Double numberValue) {
        this.numberValue = numberValue;
    }

    public Instant getDateValue() {
        return dateValue;
    }

    public void setDateValue(Instant dateValue) {
        this.dateValue = dateValue;
    }
}
