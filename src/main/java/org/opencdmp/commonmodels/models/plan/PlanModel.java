package org.opencdmp.commonmodels.models.plan;

import org.opencdmp.commonmodels.enums.PlanAccessType;
import org.opencdmp.commonmodels.enums.PlanStatus;
import org.opencdmp.commonmodels.models.PlanUserModel;
import org.opencdmp.commonmodels.models.EntityDoiModel;
import org.opencdmp.commonmodels.models.FileEnvelopeModel;
import org.opencdmp.commonmodels.models.UserModel;
import org.opencdmp.commonmodels.models.description.DescriptionModel;
import org.opencdmp.commonmodels.models.planblueprint.PlanBlueprintModel;
import org.opencdmp.commonmodels.models.plandescriptiontemplate.PlanDescriptionTemplateModel;
import org.opencdmp.commonmodels.models.planreference.PlanReferenceModel;

import java.time.Instant;
import java.util.UUID;
import java.util.List;

public class PlanModel {
    private UUID id;
    private short version;
    private String label;
    private String description;
    private PlanAccessType accessType;
    private PlanStatus status;
    private UserModel creator;
    private PlanBlueprintModel planBlueprint;
    private PlanPropertiesModel properties;
    private List<EntityDoiModel> entityDois;
    private List<DescriptionModel> descriptions;
    private List<PlanUserModel> users;
    private List<PlanReferenceModel> references;
    private List<PlanDescriptionTemplateModel> descriptionTemplates;
    private FileEnvelopeModel pdfFile;
    private FileEnvelopeModel rdaJsonFile;
    private FileEnvelopeModel supportingFilesZip;
    private String previousDOI;
    private Instant finalizedAt;
    private Instant publicAfter;
    private Instant updatedAt;
    private Instant createdAt;
    private String language;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public short getVersion() {
        return version;
    }

    public void setVersion(short version) {
        this.version = version;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PlanAccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(PlanAccessType accessType) {
        this.accessType = accessType;
    }

    public List<PlanUserModel> getUsers() {
        return users;
    }

    public void setUsers(List<PlanUserModel> users) {
        this.users = users;
    }

    public List<PlanReferenceModel> getReferences() {
        return references;
    }

    public void setReferences(List<PlanReferenceModel> references) {
        this.references = references;
    }

    public FileEnvelopeModel getPdfFile() {
        return pdfFile;
    }

    public void setPdfFile(FileEnvelopeModel pdfFile) {
        this.pdfFile = pdfFile;
    }

    public FileEnvelopeModel getRdaJsonFile() {
        return rdaJsonFile;
    }

    public void setRdaJsonFile(FileEnvelopeModel rdaJsonFile) {
        this.rdaJsonFile = rdaJsonFile;
    }

    public FileEnvelopeModel getSupportingFilesZip() {
        return supportingFilesZip;
    }

    public void setSupportingFilesZip(FileEnvelopeModel supportingFilesZip) {
        this.supportingFilesZip = supportingFilesZip;
    }

    public String getPreviousDOI() {
        return previousDOI;
    }

    public void setPreviousDOI(String previousDOI) {
        this.previousDOI = previousDOI;
    }

    public Instant getFinalizedAt() {
        return finalizedAt;
    }

    public void setFinalizedAt(Instant finalizedAt) {
        this.finalizedAt = finalizedAt;
    }

    public List<DescriptionModel> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<DescriptionModel> descriptions) {
        this.descriptions = descriptions;
    }

    public PlanStatus getStatus() {
        return status;
    }

    public void setStatus(PlanStatus status) {
        this.status = status;
    }

    public PlanBlueprintModel getPlanBlueprint() {
        return planBlueprint;
    }

    public void setPlanBlueprint(PlanBlueprintModel planBlueprint) {
        this.planBlueprint = planBlueprint;
    }

    public UserModel getCreator() {
        return creator;
    }

    public void setCreator(UserModel creator) {
        this.creator = creator;
    }

    public PlanPropertiesModel getProperties() {
        return properties;
    }

    public void setProperties(PlanPropertiesModel properties) {
        this.properties = properties;
    }

    public Instant getPublicAfter() {
        return publicAfter;
    }

    public void setPublicAfter(Instant publicAfter) {
        this.publicAfter = publicAfter;
    }

    public List<EntityDoiModel> getEntityDois() {
        return entityDois;
    }

    public void setEntityDois(List<EntityDoiModel> entityDois) {
        this.entityDois = entityDois;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<PlanDescriptionTemplateModel> getDescriptionTemplates() {
        return descriptionTemplates;
    }

    public void setDescriptionTemplates(List<PlanDescriptionTemplateModel> descriptionTemplates) {
        this.descriptionTemplates = descriptionTemplates;
    }
}
