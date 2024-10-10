package org.opencdmp.commonmodels.models.descriptiotemplate;


import org.opencdmp.commonmodels.models.DescriptionTemplateTypeModel;

import java.util.UUID;

public class DescriptionTemplateModel {

	private UUID id;

	private String label;

	private String description;
	private DescriptionTemplateTypeModel type;

	private UUID groupId;

	private Short version;

	private String language;

	private DefinitionModel definition;

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

	public UUID getGroupId() {
		return groupId;
	}

	public void setGroupId(UUID groupId) {
		this.groupId = groupId;
	}

	public Short getVersion() {
		return version;
	}

	public void setVersion(Short version) {
		this.version = version;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public DefinitionModel getDefinition() {
		return definition;
	}

	public void setDefinition(DefinitionModel definition) {
		this.definition = definition;
	}

	public DescriptionTemplateTypeModel getType() {
		return type;
	}

	public void setType(DescriptionTemplateTypeModel type) {
		this.type = type;
	}
}


