package org.opencdmp.commonmodels.models.reference;

import org.opencdmp.commonmodels.enums.ReferenceSourceType;

import java.util.UUID;

public class ReferenceModel {

	private UUID id;

	private String label;

	private ReferenceTypeModel type;

	private String description;

	private ReferenceDefinitionModel definition;

	private String reference;

	private String abbreviation;

	private String source;

	private ReferenceSourceType sourceType;

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

    public ReferenceDefinitionModel getDefinition() {
        return definition;
    }

    public void setDefinition(ReferenceDefinitionModel definition) {
        this.definition = definition;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ReferenceSourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(ReferenceSourceType sourceType) {
        this.sourceType = sourceType;
    }

    public ReferenceTypeModel getType() {
        return type;
    }

    public void setType(ReferenceTypeModel type) {
        this.type = type;
    }
}

