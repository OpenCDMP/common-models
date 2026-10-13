package org.opencdmp.commonmodels.models.plan;

import org.opencdmp.commonmodels.models.plandescriptionfields.PropertyDefinitionFieldSetModel;

import java.util.List;
import java.util.Map;

public class PlanPropertiesModel {

	private Map<String, PropertyDefinitionFieldSetModel> fieldSets;

	private List<PlanContactModel> contacts;

	public List<PlanContactModel> getContacts() {
		return contacts;
	}

	public void setContacts(List<PlanContactModel> contacts) {
		this.contacts = contacts;
	}

	public Map<String, PropertyDefinitionFieldSetModel> getFieldSets() {
		return fieldSets;
	}

	public void setFieldSets(Map<String, PropertyDefinitionFieldSetModel> fieldSets) {
		this.fieldSets = fieldSets;
	}
}


