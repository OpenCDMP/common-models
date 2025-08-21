package org.opencdmp.commonmodels.models.planblueprint;


import java.util.List;

public class UploadFieldModel extends FieldModel {

	private List<UploadOptionModel> types;

	public List<UploadOptionModel> getTypes() {
		return types;
	}

	private Integer maxFileSizeInMB;

	public void setTypes(List<UploadOptionModel> types) {
		this.types = types;
	}

	public Integer getMaxFileSizeInMB() {
		return maxFileSizeInMB;
	}

	public void setMaxFileSizeInMB(Integer maxFileSizeInMB) {
		this.maxFileSizeInMB = maxFileSizeInMB;
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
