package com.skycloud.api.domain.base;
import java.util.ArrayList;
import java.util.List;
public class ConfigurationOptions{
	private List<String> groups;
	private List<String> hosts;
	private List<String> images;
	private List<String> maps;
	private List<String> screens;
	private List<String> templates;
	public void setGroups(List<String> groups) {
		this.groups = groups;
	}
	public List<String> getGroups() {
		 if(groups==null){
			groups   = new ArrayList<String>();
			return groups;
		}
		 return groups;
	}
	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}
	public List<String> getHosts() {
		 if(hosts==null){
			hosts   = new ArrayList<String>();
			return hosts;
		}
		 return hosts;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public List<String> getImages() {
		 if(images==null){
			images   = new ArrayList<String>();
			return images;
		}
		 return images;
	}
	public void setMaps(List<String> maps) {
		this.maps = maps;
	}
	public List<String> getMaps() {
		 if(maps==null){
			maps   = new ArrayList<String>();
			return maps;
		}
		 return maps;
	}
	public void setScreens(List<String> screens) {
		this.screens = screens;
	}
	public List<String> getScreens() {
		 if(screens==null){
			screens   = new ArrayList<String>();
			return screens;
		}
		 return screens;
	}
	public void setTemplates(List<String> templates) {
		this.templates = templates;
	}
	public List<String> getTemplates() {
		 if(templates==null){
			templates   = new ArrayList<String>();
			return templates;
		}
		 return templates;
	}
}
