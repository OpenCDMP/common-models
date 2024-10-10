package org.opencdmp.commonmodels.models.descriptiotemplate;

public class MultiplicityModel {

	private Integer min;

	private Integer max;

	private String placeholder;

	private Boolean tableView;

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public Boolean getTableView() {
		return tableView;
	}

	public void setTableView(Boolean tableView) {
		this.tableView = tableView;
	}
}
