package org.opencdmp.commonmodels.models.plan;

import java.util.List;

public class PlanPropertiesModel {

	private List<PlanBlueprintValueModel> planBlueprintValues;

	private List<PlanContactModel> contacts;

	public List<PlanContactModel> getContacts() {
		return contacts;
	}

	public void setContacts(List<PlanContactModel> contacts) {
		this.contacts = contacts;
	}

	public List<PlanBlueprintValueModel> getPlanBlueprintValues() {
		return planBlueprintValues;
	}

	public void setPlanBlueprintValues(List<PlanBlueprintValueModel> planBlueprintValues) {
		this.planBlueprintValues = planBlueprintValues;
	}
}


