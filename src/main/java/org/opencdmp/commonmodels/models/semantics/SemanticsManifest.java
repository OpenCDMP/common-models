package org.opencdmp.commonmodels.models.semantics;

import java.util.List;

/**
 * The semantic keys a plugin reads, published with its configuration. It ships with the plugin, so it changes with a
 * plugin release. OpenCDMP aggregates the manifests of a tenant's plugins to tell template and blueprint authors what
 * each plugin can do with their structure; nothing in it blocks saving or finalizing.
 */
public class SemanticsManifest {
	/** The key prefixes the plugin owns or reads, with a readable name, e.g. {@code rda} "RDA maDMP". */
	private List<SemanticVocabulary> vocabularies;
	/** What the plugin reads, one entry per value it uses. */
	private List<SemanticKeyUsage> keys;
	/** The objects its values make up, e.g. a distribution and its host, for editors to offer and group by. Optional. */
	private List<SemanticObject> objects;

	public SemanticsManifest() {
	}

	public SemanticsManifest(List<SemanticVocabulary> vocabularies, List<SemanticKeyUsage> keys) {
		this.vocabularies = vocabularies;
		this.keys = keys;
	}

	public List<SemanticVocabulary> getVocabularies() {
		return vocabularies;
	}

	public void setVocabularies(List<SemanticVocabulary> vocabularies) {
		this.vocabularies = vocabularies;
	}

	public List<SemanticKeyUsage> getKeys() {
		return keys;
	}

	public void setKeys(List<SemanticKeyUsage> keys) {
		this.keys = keys;
	}

	public List<SemanticObject> getObjects() {
		return objects;
	}

	public void setObjects(List<SemanticObject> objects) {
		this.objects = objects;
	}
}
