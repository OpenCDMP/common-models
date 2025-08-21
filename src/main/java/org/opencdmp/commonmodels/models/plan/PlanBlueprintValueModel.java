package org.opencdmp.commonmodels.models.plan;

import org.opencdmp.commonmodels.models.FileEnvelopeModel;

import java.time.Instant;
import java.util.UUID;

public class PlanBlueprintValueModel {

	private UUID fieldId;

	private String value;

	private FileEnvelopeModel file;

	private Instant dateValue;

	private Double numberValue;

	public UUID getFieldId() {
		return fieldId;
	}

	public void setFieldId(UUID fieldId) {
		this.fieldId = fieldId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public FileEnvelopeModel getFile() {
		return file;
	}

	public void setFile(FileEnvelopeModel file) {
		this.file = file;
	}

	public Instant getDateValue() {
		return dateValue;
	}

	public void setDateValue(Instant dateValue) {
		this.dateValue = dateValue;
	}

	public Double getNumberValue() {
		return numberValue;
	}

	public void setNumberValue(Double numberValue) {
		this.numberValue = numberValue;
	}
}
