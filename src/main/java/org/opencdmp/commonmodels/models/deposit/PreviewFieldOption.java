package org.opencdmp.commonmodels.models.deposit;

/**
 * A selectable option for a {@link PreviewField} of type Select.
 */
public class PreviewFieldOption {
    private String label;
    private String value;

    public PreviewFieldOption(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public PreviewFieldOption() {
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
