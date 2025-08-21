package org.opencdmp.commonmodels.models;

import org.opencdmp.commonmodels.enums.PlanUserRole;
import org.opencdmp.commonmodels.models.user.UserModel;

import java.util.UUID;

public class PlanUserModel {
    private UserModel user;
    private PlanUserRole role;
    private UUID sectionId;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public PlanUserRole getRole() {
        return role;
    }

    public void setRole(PlanUserRole role) {
        this.role = role;
    }

    public UUID getSectionId() {
        return sectionId;
    }

    public void setSectionId(UUID sectionId) {
        this.sectionId = sectionId;
    }
}
