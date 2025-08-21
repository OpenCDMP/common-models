package org.opencdmp.commonmodels.models.planblueprint;

import org.opencdmp.commonmodels.models.plugin.PluginModel;

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
}
