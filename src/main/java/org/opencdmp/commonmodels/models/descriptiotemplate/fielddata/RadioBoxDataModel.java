package org.opencdmp.commonmodels.models.descriptiotemplate.fielddata;

import java.util.List;

public class RadioBoxDataModel extends BaseFieldDataModel {

	private List<RadioBoxOptionModel> options;

	public List<RadioBoxOptionModel> getOptions() {
		return options;
	}

	public void setOptions(List<RadioBoxOptionModel> options) {
		this.options = options;
	}

	public static class RadioBoxOptionModel {
		private String label;
		private String value;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
}
