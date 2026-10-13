package org.opencdmp.commonmodels.models;


import org.opencdmp.commonmodels.enums.DataType;
import org.opencdmp.commonmodels.enums.PluginEntityType;

import java.util.List;

public class ConfigurationField {
    private String code;
    private DataType type;
    private String label;
    private List<PluginEntityType> appliesTo;
    private boolean authInfo;
    private List<ConfigurationFieldOption> options;
    /**
     * The value the plugin uses when the field is left empty, for editors to show (not to store:
     * an empty field keeps falling back to the next configuration scope and then to this default).
     */
    private String defaultValue;
    /** A heading editors group the field under, e.g. "Cover page"; fields keep their declared order within it. */
    private String group;
    /** One or two sentences an editor shows under the label. */
    private String description;
    /**
     * Where more options come from, besides {@link #options}: {@code "referenceTypes"} adds one option per
     * reference type of the platform (value: its code, label: its name).
     */
    private String optionsSource;

    public ConfigurationField(String code, DataType type, String label, List<PluginEntityType> appliesTo, boolean authInfo) {
        this.code = code;
        this.type = type;
        this.label = label;
        this.appliesTo = appliesTo;
        this.authInfo = authInfo;
    }

    public ConfigurationField(String code, DataType type, String label, List<PluginEntityType> appliesTo, boolean authInfo, List<ConfigurationFieldOption> options) {
        this(code, type, label, appliesTo, authInfo);
        this.options = options;
    }

    public ConfigurationField() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<PluginEntityType> getAppliesTo() {
        return appliesTo;
    }

    public void setAppliesTo(List<PluginEntityType> appliesTo) {
        this.appliesTo = appliesTo;
    }

    public boolean isAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(boolean authInfo) {
        this.authInfo = authInfo;
    }

    public List<ConfigurationFieldOption> getOptions() {
        return options;
    }

    public void setOptions(List<ConfigurationFieldOption> options) {
        this.options = options;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOptionsSource() {
        return optionsSource;
    }

    public void setOptionsSource(String optionsSource) {
        this.optionsSource = optionsSource;
    }
}
