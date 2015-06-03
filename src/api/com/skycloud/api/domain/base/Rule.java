package com.skycloud.api.domain.base;
public class Rule{
	private RuleProperty applications ;
	private RuleProperty discoveryRules;
	private RuleProperty graphs;
	private RuleProperty groups;
	private RuleProperty hosts;
	private RuleProperty images;
	private RuleProperty maps;
	private RuleProperty screens;
	private RuleProperty templateLinkage;
	private RuleProperty templates;
	private RuleProperty templateScreens;
	private RuleProperty triggers;
	public void setApplications(RuleProperty applications) {
		this.applications = applications;
	}
	public RuleProperty getApplications() {
		if(null==applications){
			applications = new RuleProperty();
		}
		return applications;
	}
	public void setDiscoveryRules(RuleProperty discoveryRules) {
		
		this.discoveryRules = discoveryRules;
	}
	public RuleProperty getDiscoveryRules() {
		if(null==discoveryRules){
			discoveryRules = new RuleProperty();
		}
		return discoveryRules;
	}
	public void setGraphs(RuleProperty graphs) {
		this.graphs = graphs;
	}
	public RuleProperty getGraphs() {
		if(null==graphs){
			graphs = new RuleProperty();
		}
		return graphs;
	}
	public void setGroups(RuleProperty groups) {
		this.groups = groups;
	}
	public RuleProperty getGroups() {
		if(null==groups){
			groups = new RuleProperty();
		}
		return groups;
	}
	public void setHosts(RuleProperty hosts) {
		this.hosts = hosts;
	}
	public RuleProperty getHosts() {
		if(null==hosts){
			hosts = new RuleProperty();
		}
		return hosts;
	}
	public void setImages(RuleProperty images) {
		this.images = images;
	}
	public RuleProperty getImages() {
		if(null==images){
			images = new RuleProperty();
		}
		return images;
	}
	public void setMaps(RuleProperty maps) {
		this.maps = maps;
	}
	public RuleProperty getMaps() {
		if(null==maps){
			maps = new RuleProperty();
		}
		return maps;
	}
	public void setScreens(RuleProperty screens) {
		this.screens = screens;
	}
	public RuleProperty getScreens() {
		if(null==screens){
			screens = new RuleProperty();
		}
		return screens;
	}
	public void setTemplateLinkage(RuleProperty templateLinkage) {
		this.templateLinkage = templateLinkage;
	}
	public RuleProperty getTemplateLinkage() {
		if(null==templateLinkage){
			templateLinkage = new RuleProperty();
		}
		return templateLinkage;
	}
	public void setTemplates(RuleProperty templates) {
		this.templates = templates;
	}
	public RuleProperty getTemplates() {
		if(null==templates){
			templates = new RuleProperty();
		}
		return templates;
	}
	public void setTemplateScreens(RuleProperty templateScreens) {
		this.templateScreens = templateScreens;
	}
	public RuleProperty getTemplateScreens() {
		if(null==templateScreens){
			templateScreens = new RuleProperty();
		}
		return templateScreens;
	}
	public void setTriggers(RuleProperty triggers) {
		this.triggers = triggers;
	}
	public RuleProperty getTriggers() {
		if(null==triggers){
			triggers = new RuleProperty();
		}
		return triggers;
	}
}
