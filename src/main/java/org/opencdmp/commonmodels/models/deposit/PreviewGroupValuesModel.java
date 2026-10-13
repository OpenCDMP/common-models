package org.opencdmp.commonmodels.models.deposit;

import java.util.List;

/**
 * User-edited entries of a repeatable preview group, submitted with a deposit
 * and persisted for later re-deposits. Replacement is whole-list: when a group
 * is edited, the submitted items become the deposited array. The base items
 * snapshot (what the mapping produced when the user edited) allows later
 * deposits to detect whether the mapping output changed in the meantime.
 */
public class PreviewGroupValuesModel {
    private String groupCode;
    private List<PreviewGroupItemModel> items;
    private List<PreviewGroupItemModel> baseItems;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public List<PreviewGroupItemModel> getItems() {
        return items;
    }

    public void setItems(List<PreviewGroupItemModel> items) {
        this.items = items;
    }

    public List<PreviewGroupItemModel> getBaseItems() {
        return baseItems;
    }

    public void setBaseItems(List<PreviewGroupItemModel> baseItems) {
        this.baseItems = baseItems;
    }
}
