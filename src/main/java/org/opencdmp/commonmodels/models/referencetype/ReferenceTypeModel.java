package org.opencdmp.commonmodels.models.referencetype;

import java.util.UUID;

public class ReferenceTypeModel {

    private UUID id;

    private String name;

    private String code;

    private ReferenceTypeDefinitionModel definition;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ReferenceTypeDefinitionModel getDefinition() {
        return definition;
    }

    public void setDefinition(ReferenceTypeDefinitionModel definition) {
        this.definition = definition;
    }
}
