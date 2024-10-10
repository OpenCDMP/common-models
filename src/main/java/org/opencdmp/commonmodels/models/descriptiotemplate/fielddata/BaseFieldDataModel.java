package org.opencdmp.commonmodels.models.descriptiotemplate.fielddata;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.opencdmp.commonmodels.enums.FieldType;

@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "fieldType",
		visible = true,
		defaultImpl = LabelDataModel.class)
@JsonSubTypes({
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.BooleanDecision),
		@JsonSubTypes.Type(value = LabelAndMultiplicityDataModel.class, name = FieldType.Names.InternalEntitiesDescriptions),
		@JsonSubTypes.Type(value = LabelAndMultiplicityDataModel.class, name = FieldType.Names.InternalEntitiesPlans),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.CheckBox),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.DatePicker),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.FreeText),
		@JsonSubTypes.Type(value = ReferenceTypeDataModel.class, name = FieldType.Names.ReferenceTypes),
		@JsonSubTypes.Type(value = RadioBoxDataModel.class, name = FieldType.Names.RadioBox),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.RichTextarea),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.Tags),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.TextArea),
		@JsonSubTypes.Type(value = UploadDataModel.class, name = FieldType.Names.Upload),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.Validation),
		@JsonSubTypes.Type(value = LabelDataModel.class, name = FieldType.Names.DatasetIdentifier),
		@JsonSubTypes.Type(value = SelectDataModel.class, name = FieldType.Names.Select)
})
public abstract class BaseFieldDataModel {

	private String label;

	private FieldType fieldType;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public FieldType getFieldType() {
		return fieldType;
	}

	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}
	
}
