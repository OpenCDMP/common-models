package org.opencdmp.commonmodels.models.planblueprint;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.opencdmp.commonmodels.enums.PlanBlueprintFieldCategory;

import java.util.List;
import java.util.UUID;

@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "category",
		visible = true)
@JsonSubTypes({
		@JsonSubTypes.Type(value = SystemFieldModel.class, name = "0"),
		@JsonSubTypes.Type(value = ExtraFieldModel.class, name = "1"),
		@JsonSubTypes.Type(value = ReferenceTypeFieldModel.class, name = "2"),
		@JsonSubTypes.Type(value = UploadFieldModel.class, name = "3")
})
public abstract class FieldModel {
	private UUID id;
	private PlanBlueprintFieldCategory category;
	private String label;
	private String placeholder;
	private String description;
	private List<String> semantics;
	private Integer ordinal;
	private Boolean required;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public PlanBlueprintFieldCategory getCategory() {
		return category;
	}

	public void setCategory(PlanBlueprintFieldCategory category) {
		this.category = category;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getSemantics() {
		return semantics;
	}

	public void setSemantics(List<String> semantics) {
		this.semantics = semantics;
	}

	public Integer getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}
}
