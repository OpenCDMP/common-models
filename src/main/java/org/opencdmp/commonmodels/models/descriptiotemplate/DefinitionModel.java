package org.opencdmp.commonmodels.models.descriptiotemplate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.opencdmp.commonmodels.models.planblueprintdescriptiontemplatefields.FieldModel;
import org.opencdmp.commonmodels.models.planblueprintdescriptiontemplatefields.FieldSetModel;
import org.opencdmp.commonmodels.models.planblueprintdescriptiontemplatefields.SectionModel;
import org.opencdmp.commonmodels.models.plugin.PluginModel;

import java.util.ArrayList;
import java.util.List;

public class DefinitionModel {

	private List<SectionModel> sections;

	private List<PluginModel> plugins;

	public List<SectionModel> getSections() {
		return sections;
	}

	public void setSections(List<SectionModel> sections) {
		this.sections = sections;
	}

	public List<PluginModel> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<PluginModel> plugins) {
		this.plugins = plugins;
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

	@JsonIgnore
	public List<FieldSetModel> getFieldSetById(String id) {
		return this.getAllFieldSets().stream().filter(x-> id.equals(x.getId())).toList();
	}

	@JsonIgnore
	public List<FieldModel> getFieldById(String id) {
		return this.getAllField().stream().filter(x-> id.equals(x.getId())).toList();
	}

}
