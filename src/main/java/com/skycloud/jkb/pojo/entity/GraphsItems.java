package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GraphsItems generated by hbm2java
 */
@Entity
@Table(name = "graphs_items", catalog = "skycloud")
public class GraphsItems implements java.io.Serializable {

	private long gitemid;
	private Graphs graphs;
	private Items items;
	private int drawtype;
	private int sortorder;
	private String color;
	private int yaxisside;
	private int calcFnc;
	private int type;

	public GraphsItems() {
	}

	public GraphsItems(long gitemid, Graphs graphs, Items items, int drawtype, int sortorder, String color,
			int yaxisside, int calcFnc, int type) {
		this.gitemid = gitemid;
		this.graphs = graphs;
		this.items = items;
		this.drawtype = drawtype;
		this.sortorder = sortorder;
		this.color = color;
		this.yaxisside = yaxisside;
		this.calcFnc = calcFnc;
		this.type = type;
	}

	@Id
	@Column(name = "gitemid", unique = true, nullable = false)
	public long getGitemid() {
		return this.gitemid;
	}

	public void setGitemid(long gitemid) {
		this.gitemid = gitemid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "graphid", nullable = false)
	public Graphs getGraphs() {
		return this.graphs;
	}

	public void setGraphs(Graphs graphs) {
		this.graphs = graphs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "itemid", nullable = false)
	public Items getItems() {
		return this.items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Column(name = "drawtype", nullable = false)
	public int getDrawtype() {
		return this.drawtype;
	}

	public void setDrawtype(int drawtype) {
		this.drawtype = drawtype;
	}

	@Column(name = "sortorder", nullable = false)
	public int getSortorder() {
		return this.sortorder;
	}

	public void setSortorder(int sortorder) {
		this.sortorder = sortorder;
	}

	@Column(name = "color", nullable = false, length = 6)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "yaxisside", nullable = false)
	public int getYaxisside() {
		return this.yaxisside;
	}

	public void setYaxisside(int yaxisside) {
		this.yaxisside = yaxisside;
	}

	@Column(name = "calc_fnc", nullable = false)
	public int getCalcFnc() {
		return this.calcFnc;
	}

	public void setCalcFnc(int calcFnc) {
		this.calcFnc = calcFnc;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
