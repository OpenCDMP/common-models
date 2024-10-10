package org.opencdmp.commonmodels.models.planblueprint;

import org.opencdmp.commonmodels.models.reference.ReferenceTypeModel;

public class ReferenceTypeFieldModel extends FieldModel {

	private ReferenceTypeModel referenceType;
	private Boolean multipleSelect;

	public ReferenceTypeModel getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(ReferenceTypeModel referenceType) {
		this.referenceType = referenceType;
	}

	public Boolean getMultipleSelect() {
		return multipleSelect;
	}

	public void setMultipleSelect(Boolean multipleSelect) {
		this.multipleSelect = multipleSelect;
	}
}
