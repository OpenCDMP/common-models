package org.opencdmp.commonmodels.models.deposit;

import java.util.List;

/**
 * The deposit preview descriptor returned by a deposit plugin: a form
 * description of the metadata that would be submitted to the target repository
 * for a given plan, with current values prefilled by the plugin's mapping.
 * The descriptor describes the repository's schema — not only the fields the
 * mapping populates — so the user can complete metadata the plan does not
 * carry before submitting. Edited values are sent back with the deposit
 * request as {@link PreviewFieldValue} entries keyed by field code.
 */
public class DepositPreviewModel {
    private List<PreviewFieldGroup> groups;

    public List<PreviewFieldGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<PreviewFieldGroup> groups) {
        this.groups = groups;
    }
}
