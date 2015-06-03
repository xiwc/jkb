package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * NodeCksum generated by hbm2java
 */
@Entity
@Table(name = "node_cksum", catalog = "skycloud")
public class NodeCksum implements java.io.Serializable {

	private NodeCksumId id;
	private Nodes nodes;

	public NodeCksum() {
	}

	public NodeCksum(NodeCksumId id, Nodes nodes) {
		this.id = id;
		this.nodes = nodes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nodeid", column = @Column(name = "nodeid", nullable = false)),
			@AttributeOverride(name = "tablename", column = @Column(name = "tablename", nullable = false, length = 64)),
			@AttributeOverride(name = "recordid", column = @Column(name = "recordid", nullable = false)),
			@AttributeOverride(name = "cksumtype", column = @Column(name = "cksumtype", nullable = false)),
			@AttributeOverride(name = "cksum", column = @Column(name = "cksum", nullable = false, length = 65535)),
			@AttributeOverride(name = "sync", column = @Column(name = "sync", nullable = false, length = 128)) })
	public NodeCksumId getId() {
		return this.id;
	}

	public void setId(NodeCksumId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nodeid", nullable = false, insertable = false, updatable = false)
	public Nodes getNodes() {
		return this.nodes;
	}

	public void setNodes(Nodes nodes) {
		this.nodes = nodes;
	}

}
