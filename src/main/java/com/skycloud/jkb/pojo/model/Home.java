/**
 * Home.java
 */
package com.skycloud.jkb.pojo.model;

import java.io.Serializable;

/**
 * 
 * 
 * @creation 2013年12月29日 下午6:13:51
 * @modification 2013年12月29日 下午6:13:51
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class Home implements Serializable {

	/** serialVersionUID [long] */
	private static final long serialVersionUID = -8487893782576908382L;

	private String id;

	private String name;

	public Home() {
		super();
	}

	public Home(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Home [id=" + id + ", name=" + name + "]";
	}

}
