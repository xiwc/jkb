package com.skycloud.api.domain.base;
public class ITService{
	private String serviceid;
	private Integer algorithm;
	private String name;
	private Integer showsla;
	private Integer sortorder;
	private Float goodsla;
	private Integer status;
	private String triggerid;
	public void setServiceid(String serviceid) {
		this.serviceid = serviceid;
	}
	public String getServiceid() {
		return serviceid;
	}
	public void setAlgorithm(Integer algorithm) {
		this.algorithm = algorithm;
	}
	public Integer getAlgorithm() {
		return algorithm;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setShowsla(Integer showsla) {
		this.showsla = showsla;
	}
	public Integer getShowsla() {
		return showsla;
	}
	public void setSortorder(Integer sortorder) {
		this.sortorder = sortorder;
	}
	public Integer getSortorder() {
		return sortorder;
	}
	public void setGoodsla(Float goodsla) {
		this.goodsla = goodsla;
	}
	public Float getGoodsla() {
		return goodsla;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setTriggerid(String triggerid) {
		this.triggerid = triggerid;
	}
	public String getTriggerid() {
		return triggerid;
	}
}
