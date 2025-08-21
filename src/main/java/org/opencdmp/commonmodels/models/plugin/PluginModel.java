package org.opencdmp.commonmodels.models.plugin;


import org.opencdmp.commonmodels.enums.PluginType;
import java.util.List;

public class PluginModel {

    private String code;

    private PluginType type;

    private List<PluginFieldModel> fields;

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

    public List<PluginFieldModel> getFields() {
        return fields;
    }

    public void setFields(List<PluginFieldModel> fields) {
        this.fields = fields;
    }
}
