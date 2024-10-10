package org.opencdmp.commonmodels.models.descriptiotemplate.fielddata;

import java.util.List;

public class SelectDataModel extends LabelAndMultiplicityDataModel {
	private List<OptionModel> options;

	public List<OptionModel> getOptions() {
		return options;
	}

	public void setOptions(List<OptionModel> options) {
		this.options = options;
	}

	public static class OptionModel {
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
