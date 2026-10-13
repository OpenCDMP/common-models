package org.opencdmp.commonmodels.models;

import org.opencdmp.commonmodels.enums.PlanUserRole;
import org.opencdmp.commonmodels.models.user.UserModel;

import java.util.UUID;

public class PlanUserModel {
    private UserModel user;
    private PlanUserRole role;
    private String sectionId;

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

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }
}
