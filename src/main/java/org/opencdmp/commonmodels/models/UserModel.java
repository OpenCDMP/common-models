package org.opencdmp.commonmodels.models;

import java.util.List;
import java.util.UUID;

public class UserModel {
    private UUID id;
    private String name;

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
}
