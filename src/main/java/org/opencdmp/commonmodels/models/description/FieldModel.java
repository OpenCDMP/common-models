package org.opencdmp.commonmodels.models.description;

import org.opencdmp.commonmodels.models.FileEnvelopeModel;
import org.opencdmp.commonmodels.models.reference.ReferenceModel;

import java.time.Instant;
import java.util.List;

public class FieldModel {

    private String id;
    private String textValue;
    private FileEnvelopeModel file;
    private Boolean booleanValue;

    private List<String> textListValue;

    private Instant dateValue;

    private List<ReferenceModel> references;

    private ExternalIdentifierModel externalIdentifier;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public List<String> getTextListValue() {
        return textListValue;
    }

    public void setTextListValue(List<String> textListValue) {
        this.textListValue = textListValue;
    }

    public Instant getDateValue() {
        return dateValue;
    }

    public void setDateValue(Instant dateValue) {
        this.dateValue = dateValue;
    }

    public List<ReferenceModel> getReferences() {
        return references;
    }

    public void setReferences(List<ReferenceModel> references) {
        this.references = references;
    }

    public ExternalIdentifierModel getExternalIdentifier() {
        return externalIdentifier;
    }

    public void setExternalIdentifier(ExternalIdentifierModel externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public FileEnvelopeModel getFile() {
        return file;
    }

    public void setFile(FileEnvelopeModel file) {
        this.file = file;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }
}
