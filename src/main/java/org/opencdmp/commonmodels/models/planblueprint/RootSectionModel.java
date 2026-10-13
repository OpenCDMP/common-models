package org.opencdmp.commonmodels.models.planblueprint;

import org.opencdmp.commonmodels.models.planblueprintdescriptiontemplatefields.SectionModel;

public class RootSectionModel extends SectionModel { ;
	private Boolean hasTemplates;
	private Boolean canEditDescriptionTemplates;

	public Boolean getHasTemplates() {
		return hasTemplates;
	}

	public void setHasTemplates(Boolean hasTemplates) {
		this.hasTemplates = hasTemplates;
	}

	public Boolean getCanEditDescriptionTemplates() {
		return canEditDescriptionTemplates;
	}

	public void setCanEditDescriptionTemplates(Boolean canEditDescriptionTemplates) {
		this.canEditDescriptionTemplates = canEditDescriptionTemplates;
	}

}
