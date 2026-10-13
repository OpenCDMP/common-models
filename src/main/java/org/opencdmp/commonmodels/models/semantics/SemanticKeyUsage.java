package org.opencdmp.commonmodels.models.semantics;

import org.opencdmp.commonmodels.enums.PluginEntityType;
import org.opencdmp.commonmodels.enums.SemanticKeyLevel;
import org.opencdmp.commonmodels.enums.SemanticValueFormat;

import java.util.List;

/**
 * One value a plugin reads. Several keys may supply the same value (e.g. {@code rda.dataset.dataset_id} and
 * {@code rda.dataset.dataset_id.identifier}); any of them counts as covering it.
 */
public class SemanticKeyUsage {
	/** The keys that supply the value; an input carrying any of them covers it. */
	private List<String> keys;
	/** True when each key is a prefix: any key starting with it and a dot also covers the value. */
	private boolean prefix;
	private SemanticKeyLevel level;
	/** Where the structure's answers are read: plan (blueprint) or description (template). */
	private List<PluginEntityType> entityTypes;
	/** A readable name for the value, e.g. "Dataset › Identifier". */
	private String label;
	/** One line on what the plugin does with it, e.g. "Written to dataset_id; the asset id is used otherwise." */
	private String purpose;
	/** Where the value lands in the plugin's output, e.g. {@code dmp.dataset[].dataset_id.identifier}; optional. */
	private String target;
	/** The form the value must take for the plugin to keep it; editors warn when an input cannot give it. Optional. */
	private SemanticValueFormat format;
	/** For {@link SemanticValueFormat#Choice}: the values the plugin accepts, e.g. {@code open}, {@code shared}, {@code closed}. */
	private List<String> values;
	/** True when the plugin keeps several values (a list, e.g. keywords), false when it keeps one. */
	private boolean multiple;
	/**
	 * What the plugin writes when the key is not answered, e.g. "The asset's internal id", for editors to show next to
	 * the value. A {@link SemanticKeyLevel#Needs} value keeps counting as a gap until it is answered: its fallback is
	 * only a placeholder (plugins mark values with a real fallback, such as the plan title, {@link SemanticKeyLevel#CanUse}).
	 */
	private String fallback;
	/**
	 * The key of the {@link SemanticObject} the value belongs to. Editors count the value once the object is used in the
	 * structure, or always when the object is {@link SemanticObject#isAlwaysPresent() always present} in the output.
	 */
	private String object;
	/** True when the key also works on a reference type's own fields, so a picked reference can supply it. */
	private boolean fromReferenceFields;
	/** True when the plugin's import writes the value back into an input carrying the key. */
	private boolean imported;

	public SemanticKeyUsage() {
	}

	public SemanticKeyUsage(List<String> keys, boolean prefix, SemanticKeyLevel level, List<PluginEntityType> entityTypes, String label, String purpose, String target) {
		this.keys = keys;
		this.prefix = prefix;
		this.level = level;
		this.entityTypes = entityTypes;
		this.label = label;
		this.purpose = purpose;
		this.target = target;
	}

	public List<String> getKeys() {
		return keys;
	}

	public void setKeys(List<String> keys) {
		this.keys = keys;
	}

	public boolean isPrefix() {
		return prefix;
	}

	public void setPrefix(boolean prefix) {
		this.prefix = prefix;
	}

	public SemanticKeyLevel getLevel() {
		return level;
	}

	public void setLevel(SemanticKeyLevel level) {
		this.level = level;
	}

	public List<PluginEntityType> getEntityTypes() {
		return entityTypes;
	}

	public void setEntityTypes(List<PluginEntityType> entityTypes) {
		this.entityTypes = entityTypes;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public SemanticValueFormat getFormat() {
		return format;
	}

	public void setFormat(SemanticValueFormat format) {
		this.format = format;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public boolean isMultiple() {
		return multiple;
	}

	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	public String getFallback() {
		return fallback;
	}

	public void setFallback(String fallback) {
		this.fallback = fallback;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public boolean isFromReferenceFields() {
		return fromReferenceFields;
	}

	public void setFromReferenceFields(boolean fromReferenceFields) {
		this.fromReferenceFields = fromReferenceFields;
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}
}
