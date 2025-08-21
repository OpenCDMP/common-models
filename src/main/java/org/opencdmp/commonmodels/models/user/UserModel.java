package org.opencdmp.commonmodels.models.user;

import org.opencdmp.commonmodels.models.UserContactInfoModel;

import java.util.List;
import java.util.UUID;

public class UserModel {
    private UUID id;
    private String name;
    private UserAdditionalInfoModel additionalInfo;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public List<UserContactInfoModel> contacts;

    public List<UserContactInfoModel> getContacts() {
        return contacts;
    }

    public void setContacts(List<UserContactInfoModel> contacts) {
        this.contacts = contacts;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UserAdditionalInfoModel getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(UserAdditionalInfoModel additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
