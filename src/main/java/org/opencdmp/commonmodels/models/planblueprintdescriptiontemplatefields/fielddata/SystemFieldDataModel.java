package org.opencdmp.commonmodels.models.planblueprintdescriptiontemplatefields.fielddata;

import org.opencdmp.commonmodels.enums.SystemFieldType;

public class SystemFieldDataModel extends BaseFieldDataModel {

    private SystemFieldType systemFieldType;

    public SystemFieldType getSystemFieldType() {
        return systemFieldType;
    }

    public void setSystemFieldType(SystemFieldType systemFieldType) {
        this.systemFieldType = systemFieldType;
    }
}
