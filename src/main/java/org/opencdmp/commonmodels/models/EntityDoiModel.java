package org.opencdmp.commonmodels.models;

import java.util.UUID;

public class EntityDoiModel {
	private UUID id;
	private String doi;
	private String repositoryId;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}
}
