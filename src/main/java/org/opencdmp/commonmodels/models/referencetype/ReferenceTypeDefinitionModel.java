package org.opencdmp.commonmodels.models.referencetype;

import java.util.List;

public class ReferenceTypeDefinitionModel {

    private List<ReferenceTypeFieldModel> fields;

    public List<ReferenceTypeFieldModel> getFields() {
        return fields;
    }

    public void setFields(List<ReferenceTypeFieldModel> fields) {
        this.fields = fields;
    }
}
