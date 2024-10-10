package org.opencdmp.commonmodels.models.planblueprint;

import org.opencdmp.commonmodels.enums.PlanBlueprintStatus;

import java.util.UUID;

public class PlanBlueprintModel {
	private UUID id;

	private String label;

	private DefinitionModel definition;

	private PlanBlueprintStatus status;

	private UUID groupId;

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

	public DefinitionModel getDefinition() {
		return definition;
	}

	public void setDefinition(DefinitionModel definition) {
		this.definition = definition;
	}

	public PlanBlueprintStatus getStatus() {
		return status;
	}

	public void setStatus(PlanBlueprintStatus status) {
		this.status = status;
	}

	public UUID getGroupId() {
		return groupId;
	}

	public void setGroupId(UUID groupId) {
		this.groupId = groupId;
	}
}


