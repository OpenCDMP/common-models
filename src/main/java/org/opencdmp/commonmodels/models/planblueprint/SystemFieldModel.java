package org.opencdmp.commonmodels.models.planblueprint;

import org.opencdmp.commonmodels.enums.PlanBlueprintSystemFieldType;

public class SystemFieldModel extends FieldModel {

	private PlanBlueprintSystemFieldType systemFieldType;

	public PlanBlueprintSystemFieldType getSystemFieldType() {
		return systemFieldType;
	}

	public void setSystemFieldType(PlanBlueprintSystemFieldType systemFieldType) {
		this.systemFieldType = systemFieldType;
	}
}
