package org.opencdmp.commonmodels.models.descriptiotemplate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class SectionModel {

	private String id;

	private Integer ordinal;

	private String title;

	private String description;

	private String extendedDescription; 

	private List<SectionModel> sections;

	private List<FieldSetModel> fieldSets;

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

	public List<SectionModel> getSections() {
		return sections;
	}

	public void setSections(List<SectionModel> sections) {
		this.sections = sections;
	}

	public List<FieldSetModel> getFieldSets() {
		return fieldSets;
	}

	public void setFieldSets(List<FieldSetModel> fieldSets) {
		this.fieldSets = fieldSets;
	}

	@JsonIgnore
	public List<FieldModel> getAllField(){
		List<FieldModel> fieldEntities = new ArrayList<>();
		if (this.getFieldSets() != null){
			for (FieldSetModel fieldSetModel: this.getFieldSets()) {
				fieldEntities.addAll(fieldSetModel.getAllField());
			}
		}
		if (this.getSections() != null){
			for (SectionModel sectionModel: this.getSections()) {
				fieldEntities.addAll(sectionModel.getAllField());
			}
		}
		return fieldEntities;
	}

	@JsonIgnore
	public List<FieldSetModel> getAllFieldSets(){
		List<FieldSetModel> fieldSetEntities = new ArrayList<>();
		if (this.getFieldSets() != null){
			fieldSetEntities.addAll(this.getFieldSets());
		}
		if (this.getSections() != null){
			for (SectionModel sectionModel: this.getSections()) {
				fieldSetEntities.addAll(sectionModel.getAllFieldSets());
			}
		}
		return fieldSetEntities;
	}
}
