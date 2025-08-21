package org.opencdmp.commonmodels.models.plugin;


import org.opencdmp.commonmodels.models.FileEnvelopeModel;

public class PluginFieldModel {

    private String code;

    private String textValue;

    private FileEnvelopeModel file;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public FileEnvelopeModel getFile() {
        return file;
    }

    public void setFile(FileEnvelopeModel file) {
        this.file = file;
    }
}
