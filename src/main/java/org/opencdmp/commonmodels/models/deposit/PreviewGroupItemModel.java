package org.opencdmp.commonmodels.models.deposit;

import java.util.List;

/**
 * One entry of a repeatable preview group (e.g. a single creator or funding
 * row): the values of the group's template fields, keyed by field code.
 */
public class PreviewGroupItemModel {
    private List<PreviewFieldValue> values;

    public List<PreviewFieldValue> getValues() {
        return values;
    }

    public void setValues(List<PreviewFieldValue> values) {
        this.values = values;
    }
}
