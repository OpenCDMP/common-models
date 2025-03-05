package org.opencdmp.commonmodels.models.description;


import org.opencdmp.commonmodels.models.plan.PlanModel;
import org.opencdmp.commonmodels.models.descriptiotemplate.DescriptionTemplateModel;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class DescriptionModel {
    private UUID id;
    private String label;
    private String description;
    private List<String> tags;
    private DescriptionStatusModel status;
    private DescriptionTemplateModel descriptionTemplate;
    private PlanModel plan;
    private UUID sectionId;
    private Instant createdAt;
    
    private PropertyDefinitionModel properties;
    
    private List<VisibilityStateModel> visibilityStates;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public PropertyDefinitionModel getProperties() {
        return properties;
    }

    public void setProperties(PropertyDefinitionModel properties) {
        this.properties = properties;
    }

    public DescriptionTemplateModel getDescriptionTemplate() {
        return descriptionTemplate;
    }

    public void setDescriptionTemplate(DescriptionTemplateModel descriptionTemplate) {
        this.descriptionTemplate = descriptionTemplate;
    }

    public PlanModel getPlan() {
        return plan;
    }

    public void setPlan(PlanModel plan) {
        this.plan = plan;
    }

    public DescriptionStatusModel getStatus() {
        return status;
    }

    public void setStatus(DescriptionStatusModel status) {
        this.status = status;
    }

    public UUID getSectionId() {
        return sectionId;
    }

    public void setSectionId(UUID sectionId) {
        this.sectionId = sectionId;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public List<VisibilityStateModel> getVisibilityStates() {
        return visibilityStates;
    }

    public void setVisibilityStates(List<VisibilityStateModel> visibilityStates) {
        this.visibilityStates = visibilityStates;
    }
}
