package com.skycloud.api.domain.base;
public class RuleProperty{
	private Boolean createMissing;
	private Boolean updateMissing;
	public void setCreateMissing(Boolean createMissing) {
		this.createMissing = createMissing;
	}
	public Boolean getCreateMissing() {
		return createMissing;
	}
	public void setUpdateMissing(Boolean updateMissing) {
		this.updateMissing = updateMissing;
	}
	public Boolean getUpdateMissing() {
		return updateMissing;
	}
}
