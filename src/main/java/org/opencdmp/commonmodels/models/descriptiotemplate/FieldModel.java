package org.opencdmp.commonmodels.models.descriptiotemplate;

import org.opencdmp.commonmodels.enums.FieldValidationType;
import org.opencdmp.commonmodels.models.descriptiotemplate.fielddata.BaseFieldDataModel;

import java.util.List;

public class FieldModel {

	private String id;

	private Integer ordinal;

	private List<String> semantics;

	private DefaultValueModel defaultValue;

	private List<FieldValidationType> validations;

	private Boolean includeInExport;

	private BaseFieldDataModel data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

	public List<String> getSemantics() {
		return semantics;
	}

	public void setSemantics(List<String> semantics) {
		this.semantics = semantics;
	}

	public DefaultValueModel getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(DefaultValueModel defaultValue) {
		this.defaultValue = defaultValue;
	}

	public List<FieldValidationType> getValidations() {
		return validations;
	}

	public void setValidations(List<FieldValidationType> validations) {
		this.validations = validations;
	}

	public Boolean getIncludeInExport() {
		return includeInExport;
	}

	public void setIncludeInExport(Boolean includeInExport) {
		this.includeInExport = includeInExport;
	}

	public BaseFieldDataModel getData() {
		return data;
	}

	public void setData(BaseFieldDataModel data) {
		this.data = data;
	}
}
