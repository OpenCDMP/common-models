package org.opencdmp.commonmodels.models.deposit;

import org.opencdmp.commonmodels.enums.PreviewFieldSource;
import org.opencdmp.commonmodels.enums.PreviewFieldType;

import java.util.List;

/**
 * A single field of a deposit preview form, described by the deposit plugin and
 * rendered by the OpenCDMP frontend. The field's code identifies it when edited
 * values are submitted back; the plugin is the only party that interprets codes.
 * <p>
 * The source marker distinguishes how the field is populated: Mapped fields are
 * prefilled by the plugin's semantic mapping and may be edited; Manual fields are
 * supported by the target repository but cannot be derived from the plan, so they
 * are rendered empty for the user to complete; System fields are fixed by
 * configuration or versioning logic and are rendered read-only.
 */
public class PreviewField {
    private String code;
    private String label;
    private String description;
    private PreviewFieldType type;
    private PreviewFieldSource source;
    private boolean required;
    private boolean multipleSelect;
    private List<PreviewFieldOption> options;
    private PreviewFieldValue value;
    private PreviewFieldValue baseValue;
    private PreviewFieldValue previousValue;
    private boolean storedValueApplied;
    private boolean vocabSearch;
    private String widgetHint;

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

    public PreviewFieldType getType() {
        return type;
    }

    public void setType(PreviewFieldType type) {
        this.type = type;
    }

    public PreviewFieldSource getSource() {
        return source;
    }

    public void setSource(PreviewFieldSource source) {
        this.source = source;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isMultipleSelect() {
        return multipleSelect;
    }

    public void setMultipleSelect(boolean multipleSelect) {
        this.multipleSelect = multipleSelect;
    }

    public List<PreviewFieldOption> getOptions() {
        return options;
    }

    public void setOptions(List<PreviewFieldOption> options) {
        this.options = options;
    }

    public PreviewFieldValue getValue() {
        return value;
    }

    public void setValue(PreviewFieldValue value) {
        this.value = value;
    }

    /**
     * The value produced by the plugin's mapping, before any stored override was
     * applied. Lets the client persist correct base values for the three-way merge.
     */
    public PreviewFieldValue getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(PreviewFieldValue baseValue) {
        this.baseValue = baseValue;
    }

    /**
     * A stored override that could NOT be reapplied because the mapping output
     * changed since it was saved; shown to the user as a hint.
     */
    public PreviewFieldValue getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(PreviewFieldValue previousValue) {
        this.previousValue = previousValue;
    }

    /**
     * True when the current value comes from a stored override rather than the
     * mapping; clients must submit such fields even when untouched, so the
     * deposited metadata matches what the form displayed.
     */
    public boolean isStoredValueApplied() {
        return storedValueApplied;
    }

    public void setStoredValueApplied(boolean storedValueApplied) {
        this.storedValueApplied = storedValueApplied;
    }

    /**
     * True when the field's options should be looked up through the plugin's
     * vocabulary search endpoint instead of the static options list.
     */
    public boolean isVocabSearch() {
        return vocabSearch;
    }

    public void setVocabSearch(boolean vocabSearch) {
        this.vocabSearch = vocabSearch;
    }

    /**
     * Optional named-widget hint (e.g. "pid") for renderers with purpose-built
     * widgets; renderers fall back to the field type when unrecognized.
     */
    public String getWidgetHint() {
        return widgetHint;
    }

    public void setWidgetHint(String widgetHint) {
        this.widgetHint = widgetHint;
    }
}
