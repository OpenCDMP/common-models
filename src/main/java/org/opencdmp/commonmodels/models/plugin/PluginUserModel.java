package org.opencdmp.commonmodels.models.plugin;


import org.opencdmp.commonmodels.enums.PluginType;

import java.util.List;

public class PluginUserModel {

    private String code;

    private PluginType type;

    private List<PluginUserFieldModel> userFields;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PluginType getType() {
        return type;
    }

    public void setType(PluginType type) {
        this.type = type;
    }

    public List<PluginUserFieldModel> getFields() {
        return userFields;
    }

    public void setFields(List<PluginUserFieldModel> userFields) {
        this.userFields = userFields;
    }
}
