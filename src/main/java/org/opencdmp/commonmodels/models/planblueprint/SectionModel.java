package org.opencdmp.commonmodels.models.planblueprint;

import java.util.List;
import java.util.UUID;

public class SectionModel {
	private UUID id;
	private String description;
	private String label;

	private Integer ordinal;
	private Boolean hasTemplates;

	private List<FieldModel> fields;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

	public Boolean getHasTemplates() {
		return hasTemplates;
	}

	public void setHasTemplates(Boolean hasTemplates) {
		this.hasTemplates = hasTemplates;
	}

	public List<FieldModel> getFields() {
		return fields;
	}

	public void setFields(List<FieldModel> fields) {
		this.fields = fields;
	}
}
