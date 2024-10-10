package org.opencdmp.commonmodels.models.description;

import java.util.List;

public class PropertyDefinitionFieldSetModel {

    private List<PropertyDefinitionFieldSetItemModel> items;

    private String comment;

    public List<PropertyDefinitionFieldSetItemModel> getItems() {
        return items;
    }

    public void setItems(List<PropertyDefinitionFieldSetItemModel> items) {
        this.items = items;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
