package org.opencdmp.commonmodels.models.descriptiotemplate.fielddata;

import java.util.List;

public class UploadDataModel extends BaseFieldDataModel {
	private List<UploadOptionModel> types;

	public List<UploadOptionModel> getTypes() {
		return types;
	}

	public void setTypes(List<UploadOptionModel> types) {
		this.types = types;
	}

	public static class UploadOptionModel {
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
