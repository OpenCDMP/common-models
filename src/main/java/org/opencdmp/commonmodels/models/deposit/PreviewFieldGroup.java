package org.opencdmp.commonmodels.models.deposit;

import java.util.List;

/**
 * A titled group of preview fields, mirroring a section of the target
 * repository's deposit form (e.g. "Basic information", "License and access").
 * Groups may nest to describe composite structures, and a repeatable group
 * describes an array of like-shaped entries (e.g. creators, funding). Field
 * codes are unique across the whole descriptor, not per group.
 */
public class PreviewFieldGroup {
    private String code;
    private String label;
    private boolean repeatable;
    private boolean required;
    private List<PreviewField> fields;
    private List<PreviewFieldGroup> groups;
    private List<PreviewGroupItemModel> items;
    private List<PreviewGroupItemModel> baseItems;
    private boolean storedItemsApplied;
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

    public boolean isRepeatable() {
        return repeatable;
    }

    public void setRepeatable(boolean repeatable) {
        this.repeatable = repeatable;
    }

    /**
     * True when the target repository requires at least one entry in a repeatable group (e.g. Dataverse's
     * "Author" and "Point of Contact" must each have at least one row) or requires the group's non-repeatable
     * fields to be present. Distinct from a field's own {@code required}, which governs an individual field.
     */
    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public List<PreviewField> getFields() {
        return fields;
    }

    public void setFields(List<PreviewField> fields) {
        this.fields = fields;
    }

    public List<PreviewFieldGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<PreviewFieldGroup> groups) {
        this.groups = groups;
    }

    /**
     * For repeatable groups: the current entries, one per array element of the
     * target repository's metadata (e.g. one item per creator). The group's
     * fields act as the per-item template; item values are keyed by field code.
     */
    public List<PreviewGroupItemModel> getItems() {
        return items;
    }

    public void setItems(List<PreviewGroupItemModel> items) {
        this.items = items;
    }

    /**
     * The entries produced by the plugin's mapping, before any stored override
     * was applied; the client persists these as the base snapshot for merging.
     */
    public List<PreviewGroupItemModel> getBaseItems() {
        return baseItems;
    }

    public void setBaseItems(List<PreviewGroupItemModel> baseItems) {
        this.baseItems = baseItems;
    }

    /**
     * True when the current items come from a stored override rather than the
     * mapping; clients must submit such groups even when untouched.
     */
    public boolean isStoredItemsApplied() {
        return storedItemsApplied;
    }

    public void setStoredItemsApplied(boolean storedItemsApplied) {
        this.storedItemsApplied = storedItemsApplied;
    }

    /**
     * Optional named-widget hint (e.g. "person", "funding") for renderers with
     * purpose-built widgets; renderers fall back to the generic repeatable row
     * editor when unrecognized.
     */
    public String getWidgetHint() {
        return widgetHint;
    }

    public void setWidgetHint(String widgetHint) {
        this.widgetHint = widgetHint;
    }
}
