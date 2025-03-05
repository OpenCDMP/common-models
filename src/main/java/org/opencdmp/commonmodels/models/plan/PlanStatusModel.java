package org.opencdmp.commonmodels.models.plan;

import java.util.UUID;

public class PlanStatusModel {

    private UUID id;

    private String name;

    private org.opencdmp.commonmodels.enums.PlanStatus internalStatus;

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

    public org.opencdmp.commonmodels.enums.PlanStatus getInternalStatus() {
        return internalStatus;
    }

    public void setInternalStatus(org.opencdmp.commonmodels.enums.PlanStatus internalStatus) {
        this.internalStatus = internalStatus;
    }
}
