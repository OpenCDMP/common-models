package org.opencdmp.commonmodels.models.descriptiotemplate.fielddata;

import org.opencdmp.commonmodels.models.reference.ReferenceTypeModel;

public class ReferenceTypeDataModel extends BaseFieldDataModel {
	private Boolean multipleSelect;

	private ReferenceTypeModel referenceType;

	public Boolean getMultipleSelect() {
		return multipleSelect;
	}

	public void setMultipleSelect(Boolean multipleSelect) {
		this.multipleSelect = multipleSelect;
	}

	public ReferenceTypeModel getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(ReferenceTypeModel referenceType) {
		this.referenceType = referenceType;
	}
}
