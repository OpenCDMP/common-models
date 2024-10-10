package org.opencdmp.commonmodels.models.plandescriptiontemplate;

import java.util.UUID;

public class PlanDescriptionTemplateModel {
	private UUID descriptionTemplateGroupId;
	private UUID sectionId;

	public UUID getDescriptionTemplateGroupId() {
		return descriptionTemplateGroupId;
	}

	public void setDescriptionTemplateGroupId(UUID descriptionTemplateGroupId) {
		this.descriptionTemplateGroupId = descriptionTemplateGroupId;
	}

	public UUID getSectionId() {
		return sectionId;
	}

	public void setSectionId(UUID sectionId) {
		this.sectionId = sectionId;
	}
}

