package org.opencdmp.commonmodels.models.planreference;

import org.opencdmp.commonmodels.models.reference.ReferenceModel;

import java.util.UUID;

public class PlanReferenceModel {
	private UUID id;
	private ReferenceModel reference;
	
	private PlanReferenceDataModel data;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public ReferenceModel getReference() {
		return reference;
	}

	public void setReference(ReferenceModel reference) {
		this.reference = reference;
	}

	public PlanReferenceDataModel getData() {
		return data;
	}

	public void setData(PlanReferenceDataModel data) {
		this.data = data;
	}
}

