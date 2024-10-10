package org.opencdmp.commonmodels.models;

import java.util.UUID;

public class TagModel {
    private UUID id;
    private String label;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
