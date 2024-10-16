package org.opencdmp.commonmodels.models.descriptiotemplate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class DefinitionModel {

	private List<PageModel> pages;

	public List<PageModel> getPages() {
		return pages;
	}

	public void setPages(List<PageModel> pages) {
		this.pages = pages;
	}


	@JsonIgnore
	public List<FieldModel> getAllField(){
		List<FieldModel> fieldEntities = new ArrayList<>();
		if (this.getPages() != null){
			for (PageModel pageModel: this.getPages()) {
				fieldEntities.addAll(pageModel.getAllField());
			}
		}
		return fieldEntities;
	}

	@JsonIgnore
	public List<FieldSetModel> getAllFieldSets(){
		List<FieldSetModel> fieldSetsEntities = new ArrayList<>();
		if (this.getPages() != null){
			for (PageModel pageModel: this.getPages()) {
				fieldSetsEntities.addAll(pageModel.getAllFieldSets());
			}
		}
		return fieldSetsEntities;
	}

	@JsonIgnore
	public List<FieldSetModel> getFieldSetById(String id) {
		return this.getAllFieldSets().stream().filter(x-> id.equals(x.getId())).toList();
	}

	@JsonIgnore
	public List<FieldModel> getFieldById(String id) {
		return this.getAllField().stream().filter(x-> id.equals(x.getId())).toList();
	}

}
