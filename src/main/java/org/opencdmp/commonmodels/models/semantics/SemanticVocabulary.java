package org.opencdmp.commonmodels.models.semantics;

/** A key prefix, the first segment of a semantic key: a standard, a repository or an organisation's own. */
public class SemanticVocabulary {
	/** The first segment, without the dot, e.g. {@code rda} or {@code zenodo}. */
	private String prefix;
	/** A readable name, e.g. "RDA maDMP". */
	private String name;
	/** True for a published metadata standard, which editors show as a standard mapping to complete. */
	private boolean standard;

	public SemanticVocabulary() {
	}

	public SemanticVocabulary(String prefix, String name, boolean standard) {
		this.prefix = prefix;
		this.name = name;
		this.standard = standard;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStandard() {
		return standard;
	}

	public void setStandard(boolean standard) {
		this.standard = standard;
	}
}
