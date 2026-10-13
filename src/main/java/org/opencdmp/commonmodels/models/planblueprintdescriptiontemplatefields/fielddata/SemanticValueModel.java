package org.opencdmp.commonmodels.models.planblueprintdescriptiontemplatefields.fielddata;

/** A semantic key and the value an answer option stands for, e.g. {@code rda.dataset.distribution.host.url} and {@code https://zenodo.org}. */
public class SemanticValueModel {
	private String key;
	private String value;

	public SemanticValueModel() {
	}

	public SemanticValueModel(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
