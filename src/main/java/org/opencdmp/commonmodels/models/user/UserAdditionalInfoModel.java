package org.opencdmp.commonmodels.models.user;


import org.opencdmp.commonmodels.models.plugin.PluginUserModel;

import java.util.List;

public class UserAdditionalInfoModel {

    private List<PluginUserModel> plugins;

    public List<PluginUserModel> getPluginConfigurations() {
        return plugins;
    }

    public void setPluginConfigurations(List<PluginUserModel> plugins) {
        this.plugins = plugins;
    }
}
