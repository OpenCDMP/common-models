package org.opencdmp.commonmodels.models.planblueprint;

import org.opencdmp.commonmodels.enums.PlanBlueprintExtraFieldDataType;

public class ExtraFieldModel extends FieldModel {

	private PlanBlueprintExtraFieldDataType dataType;

	public PlanBlueprintExtraFieldDataType getDataType() {
		return dataType;
	}

	public void setDataType(PlanBlueprintExtraFieldDataType dataType) {
		this.dataType = dataType;
	}
}
