package org.opencdmp.commonmodels.models.planblueprintdescriptiontemplatefields.fielddata;

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
		/**
		 * Values this answer stands for, exported as if an input carrying each key had been answered with it, e.g.
		 * "Zenodo" standing for {@code rda.dataset.distribution.host.title=Zenodo} and {@code ...host.url=https://zenodo.org}.
		 * An input of the same question that carries the key and is answered takes precedence. Optional.
		 */
		private List<SemanticValueModel> semantics;
		/** True when choosing this answer means there is nothing to export for the object the question describes. */
		private boolean exportsNothing;

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

		public List<SemanticValueModel> getSemantics() {
			return semantics;
		}

		public void setSemantics(List<SemanticValueModel> semantics) {
			this.semantics = semantics;
		}

		public boolean isExportsNothing() {
			return exportsNothing;
		}

		public void setExportsNothing(boolean exportsNothing) {
			this.exportsNothing = exportsNothing;
		}
	}
}
