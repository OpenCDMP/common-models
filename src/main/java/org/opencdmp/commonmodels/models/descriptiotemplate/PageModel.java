package org.opencdmp.commonmodels.models.descriptiotemplate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class PageModel {

	private String id;

	private Integer ordinal;

	private String title;

	private List<SectionModel> sections;

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

	public List<SectionModel> getSections() {
		return sections;
	}

	public void setSections(List<SectionModel> sections) {
		this.sections = sections;
	}
	@JsonIgnore
	public List<FieldModel> getAllField(){
		List<FieldModel> fieldEntities = new ArrayList<>();
		if (this.getSections() != null){
			for (SectionModel sectionModel: this.getSections()) {
				fieldEntities.addAll(sectionModel.getAllField());
			}
		}
		return fieldEntities;
	}

	@JsonIgnore
	public List<FieldSetModel> getAllFieldSets(){
		List<FieldSetModel> fieldSetsEntities = new ArrayList<>();
		if (this.getSections() != null){
			for (SectionModel sectionModel: this.getSections()) {
				fieldSetsEntities.addAll(sectionModel.getAllFieldSets());
			}
		}
		return fieldSetsEntities;
	}
}
