package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Images generated by hbm2java
 */
@Entity
@Table(name = "images", catalog = "skycloud")
public class Images implements java.io.Serializable {

	private long imageid;
	private int imagetype;
	private String name;
	private byte[] image;
	private Set<SysmapsElements> sysmapsElementsesForIconidOff = new HashSet<SysmapsElements>(0);
	private Set<SysmapsElements> sysmapsElementsesForIconidDisabled = new HashSet<SysmapsElements>(0);
	private Set<SysmapsElements> sysmapsElementsesForIconidOn = new HashSet<SysmapsElements>(0);
	private Set<IconMap> iconMaps = new HashSet<IconMap>(0);
	private Set<SysmapsElements> sysmapsElementsesForIconidMaintenance = new HashSet<SysmapsElements>(0);
	private Set<Sysmaps> sysmapses = new HashSet<Sysmaps>(0);
	private Set<IconMapping> iconMappings = new HashSet<IconMapping>(0);

	public Images() {
	}

	public Images(long imageid, int imagetype, String name, byte[] image) {
		this.imageid = imageid;
		this.imagetype = imagetype;
		this.name = name;
		this.image = image;
	}

	public Images(long imageid, int imagetype, String name, byte[] image,
			Set<SysmapsElements> sysmapsElementsesForIconidOff,
			Set<SysmapsElements> sysmapsElementsesForIconidDisabled, Set<SysmapsElements> sysmapsElementsesForIconidOn,
			Set<IconMap> iconMaps, Set<SysmapsElements> sysmapsElementsesForIconidMaintenance, Set<Sysmaps> sysmapses,
			Set<IconMapping> iconMappings) {
		this.imageid = imageid;
		this.imagetype = imagetype;
		this.name = name;
		this.image = image;
		this.sysmapsElementsesForIconidOff = sysmapsElementsesForIconidOff;
		this.sysmapsElementsesForIconidDisabled = sysmapsElementsesForIconidDisabled;
		this.sysmapsElementsesForIconidOn = sysmapsElementsesForIconidOn;
		this.iconMaps = iconMaps;
		this.sysmapsElementsesForIconidMaintenance = sysmapsElementsesForIconidMaintenance;
		this.sysmapses = sysmapses;
		this.iconMappings = iconMappings;
	}

	@Id
	@Column(name = "imageid", unique = true, nullable = false)
	public long getImageid() {
		return this.imageid;
	}

	public void setImageid(long imageid) {
		this.imageid = imageid;
	}

	@Column(name = "imagetype", nullable = false)
	public int getImagetype() {
		return this.imagetype;
	}

	public void setImagetype(int imagetype) {
		this.imagetype = imagetype;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "image", nullable = false)
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "imagesByIconidOff")
	public Set<SysmapsElements> getSysmapsElementsesForIconidOff() {
		return this.sysmapsElementsesForIconidOff;
	}

	public void setSysmapsElementsesForIconidOff(Set<SysmapsElements> sysmapsElementsesForIconidOff) {
		this.sysmapsElementsesForIconidOff = sysmapsElementsesForIconidOff;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "imagesByIconidDisabled")
	public Set<SysmapsElements> getSysmapsElementsesForIconidDisabled() {
		return this.sysmapsElementsesForIconidDisabled;
	}

	public void setSysmapsElementsesForIconidDisabled(Set<SysmapsElements> sysmapsElementsesForIconidDisabled) {
		this.sysmapsElementsesForIconidDisabled = sysmapsElementsesForIconidDisabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "imagesByIconidOn")
	public Set<SysmapsElements> getSysmapsElementsesForIconidOn() {
		return this.sysmapsElementsesForIconidOn;
	}

	public void setSysmapsElementsesForIconidOn(Set<SysmapsElements> sysmapsElementsesForIconidOn) {
		this.sysmapsElementsesForIconidOn = sysmapsElementsesForIconidOn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "images")
	public Set<IconMap> getIconMaps() {
		return this.iconMaps;
	}

	public void setIconMaps(Set<IconMap> iconMaps) {
		this.iconMaps = iconMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "imagesByIconidMaintenance")
	public Set<SysmapsElements> getSysmapsElementsesForIconidMaintenance() {
		return this.sysmapsElementsesForIconidMaintenance;
	}

	public void setSysmapsElementsesForIconidMaintenance(Set<SysmapsElements> sysmapsElementsesForIconidMaintenance) {
		this.sysmapsElementsesForIconidMaintenance = sysmapsElementsesForIconidMaintenance;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "images")
	public Set<Sysmaps> getSysmapses() {
		return this.sysmapses;
	}

	public void setSysmapses(Set<Sysmaps> sysmapses) {
		this.sysmapses = sysmapses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "images")
	public Set<IconMapping> getIconMappings() {
		return this.iconMappings;
	}

	public void setIconMappings(Set<IconMapping> iconMappings) {
		this.iconMappings = iconMappings;
	}

}
