package org.opencdmp.commonmodels.models.description;

import java.util.UUID;

public class DescriptionStatusModel {

    private UUID id;

    private String name;

    private org.opencdmp.commonmodels.enums.DescriptionStatus internalStatus;

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

    public org.opencdmp.commonmodels.enums.DescriptionStatus getInternalStatus() {
        return internalStatus;
    }

    public void setInternalStatus(org.opencdmp.commonmodels.enums.DescriptionStatus internalStatus) {
        this.internalStatus = internalStatus;
    }
}
