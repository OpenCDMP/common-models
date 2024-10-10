package org.opencdmp.commonmodels.models;

import org.opencdmp.commonmodels.enums.ContactInfoType;

import java.time.Instant;
import java.util.UUID;

public class UserContactInfoModel {

    private UUID id;

    private Integer ordinal;
    private ContactInfoType type;
    private String value;
    private Instant createdAt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public ContactInfoType getType() {
        return type;
    }

    public void setType(ContactInfoType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
