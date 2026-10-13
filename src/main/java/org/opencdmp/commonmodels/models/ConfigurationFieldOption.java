package org.opencdmp.commonmodels.models;

/**
 * A selectable option for a {@link ConfigurationField} of type Select.
 */
public class ConfigurationFieldOption {
    private String label;
    private String value;

    public ConfigurationFieldOption(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public ConfigurationFieldOption() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
