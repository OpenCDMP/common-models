package org.opencdmp.commonmodels.models.semantics;

import org.opencdmp.commonmodels.enums.PluginEntityType;

import java.util.List;

/**
 * An object in a plugin's output that several values make up, e.g. {@code rda.dataset.distribution} or its
 * {@code rda.dataset.distribution.host}. Editors offer these when an author says what a question or a section
 * describes, group coverage by them, and only expect an object's needed values when the object is used or
 * {@link #isAlwaysPresent() always present}.
 */
public class SemanticObject {
	/** The key naming the object; its values' keys start with it and a dot. */
	private String key;
	/** A readable name, e.g. "Dataset › Distribution › Host". */
	private String label;
	/** The key of the object this one sits in, or null for a top-level object. */
	private String parent;
	/** True when the output holds a list of them (one per answer), false for a single one. */
	private boolean multiple;
	/** True when a reference input carrying the key fills the whole object from the reference's own fields. */
	private boolean fromReference;
	/**
	 * True when every output has the object, whether or not the structure maps it (RDA: the contact, its identifier,
	 * the dataset identifier). Its values always count; other objects' values count once the object is used.
	 */
	private boolean alwaysPresent;
	/** Where the structure's answers are read: plan (blueprint) or description (template). */
	private List<PluginEntityType> entityTypes;
	/** Where the object lands in the plugin's output, e.g. {@code dmp.dataset[].distribution[]}; optional. */
	private String target;

	public SemanticObject() {
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public boolean isMultiple() {
		return multiple;
	}

	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	public boolean isFromReference() {
		return fromReference;
	}

	public void setFromReference(boolean fromReference) {
		this.fromReference = fromReference;
	}

	public List<PluginEntityType> getEntityTypes() {
		return entityTypes;
	}

	public void setEntityTypes(List<PluginEntityType> entityTypes) {
		this.entityTypes = entityTypes;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public boolean isAlwaysPresent() {
		return alwaysPresent;
	}

	public void setAlwaysPresent(boolean alwaysPresent) {
		this.alwaysPresent = alwaysPresent;
	}
}
