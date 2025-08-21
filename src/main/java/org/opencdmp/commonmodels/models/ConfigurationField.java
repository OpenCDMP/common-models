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

    public ConfigurationField(String code, DataType type, String label, List<PluginEntityType> appliesTo, boolean authInfo) {
        this.code = code;
        this.type = type;
        this.label = label;
        this.appliesTo = appliesTo;
        this.authInfo = authInfo;
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
}
