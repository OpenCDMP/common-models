package org.opencdmp.commonmodels.models.plandescriptiontemplate;

import java.util.UUID;

public class PlanDescriptionTemplateModel {
	private UUID descriptionTemplateGroupId;
	private String sectionId;

	public UUID getDescriptionTemplateGroupId() {
		return descriptionTemplateGroupId;
	}

	public void setDescriptionTemplateGroupId(UUID descriptionTemplateGroupId) {
		this.descriptionTemplateGroupId = descriptionTemplateGroupId;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
}

