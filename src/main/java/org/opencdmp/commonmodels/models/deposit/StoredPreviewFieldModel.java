package org.opencdmp.commonmodels.models.deposit;

/**
 * A persisted preview override: the value the user confirmed together with the
 * mapped base value it replaced at the time of editing. The base enables a
 * three-way merge on later deposits of the same plan line: a Manual field's
 * stored value always prefills (it has no plan source), while a Mapped field's
 * stored value is reapplied only when the current mapping still produces the
 * stored base — otherwise the fresh mapped value wins and the stored value is
 * surfaced as a hint.
 */
public class StoredPreviewFieldModel {
    private PreviewFieldValue value;
    private PreviewFieldValue base;

    public PreviewFieldValue getValue() {
        return value;
    }

    public void setValue(PreviewFieldValue value) {
        this.value = value;
    }

    public PreviewFieldValue getBase() {
        return base;
    }

    public void setBase(PreviewFieldValue base) {
        this.base = base;
    }
}
