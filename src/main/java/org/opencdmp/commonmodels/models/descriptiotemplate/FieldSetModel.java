package org.opencdmp.commonmodels.models.descriptiotemplate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class FieldSetModel {

	private String id;

	private Integer ordinal;

	private String title;

	private String description;

	private String extendedDescription;

	private String additionalInformation;

	private boolean hasMultiplicity;
	
	private MultiplicityModel multiplicity;

	private List<FieldModel> fields;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtendedDescription() {
		return extendedDescription;
	}

	public void setExtendedDescription(String extendedDescription) {
		this.extendedDescription = extendedDescription;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public boolean isHasMultiplicity() {
		return hasMultiplicity;
	}

	public void setHasMultiplicity(boolean hasMultiplicity) {
		this.hasMultiplicity = hasMultiplicity;
	}

	public MultiplicityModel getMultiplicity() {
		return multiplicity;
	}

	public void setMultiplicity(MultiplicityModel multiplicity) {
		this.multiplicity = multiplicity;
	}

	public List<FieldModel> getFields() {
		return fields;
	}

	public void setFields(List<FieldModel> fields) {
		this.fields = fields;
	}



	@JsonIgnore
	public List<FieldModel> getAllField() {
		return this.getFields() == null ? new ArrayList<>() : this.getFields();
	}

	@JsonIgnore
	public List<FieldModel> getFieldById(String id) {
		return this.getAllField().stream().filter(x-> id.equals(x.getId())).toList();
	}

}
