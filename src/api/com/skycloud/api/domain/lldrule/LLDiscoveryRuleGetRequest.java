package com.skycloud.api.domain.lldrule;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class LLDiscoveryRuleGetRequest extends RequestBase{
	public LLDiscoveryRuleGetRequest() {
		super("discoveryrule.get");
	}
	private LLDiscoveryRuleGetParams params = new LLDiscoveryRuleGetParams();
	public void setParams(LLDiscoveryRuleGetParams params) {
		this.params = params;
	}
	public LLDiscoveryRuleGetParams getParams() {
		return params;
	}
	public static class LLDiscoveryRuleGetParams{
		private List<String> itemids;
		private List<String> hostids;
		private Boolean inherited;
		private List<String> interfaceids;
		private Boolean monitored;
		private Boolean templated;
		private List<String> templateids;
		private String selectHosts;
		private String selectGraphs;
		private String selectItems;
		private String selectTriggers;
		private Object filter;
		private Integer limitSelects;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		public void setItemids(List<String> itemids) {
			this.itemids = itemids;
		}
		public List<String> getItemids() {
			 if(itemids==null){
				itemids   = new ArrayList<String>();
				return itemids;
			}
			 return itemids;
		}
		public void setHostids(List<String> hostids) {
			this.hostids = hostids;
		}
		public List<String> getHostids() {
			 if(hostids==null){
				hostids   = new ArrayList<String>();
				return hostids;
			}
			 return hostids;
		}
		public void setInherited(Boolean inherited) {
			this.inherited = inherited;
		}
		public Boolean getInherited() {
			return inherited;
		}
		public void setInterfaceids(List<String> interfaceids) {
			this.interfaceids = interfaceids;
		}
		public List<String> getInterfaceids() {
			 if(interfaceids==null){
				interfaceids   = new ArrayList<String>();
				return interfaceids;
			}
			 return interfaceids;
		}
		public void setMonitored(Boolean monitored) {
			this.monitored = monitored;
		}
		public Boolean getMonitored() {
			return monitored;
		}
		public void setTemplated(Boolean templated) {
			this.templated = templated;
		}
		public Boolean getTemplated() {
			return templated;
		}
		public void setTemplateids(List<String> templateids) {
			this.templateids = templateids;
		}
		public List<String> getTemplateids() {
			 if(templateids==null){
				templateids   = new ArrayList<String>();
				return templateids;
			}
			 return templateids;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
		}
		public void setSelectGraphs(String selectGraphs) {
			this.selectGraphs = selectGraphs;
		}
		public String getSelectGraphs() {
			return selectGraphs;
		}
		public void setSelectItems(String selectItems) {
			this.selectItems = selectItems;
		}
		public String getSelectItems() {
			return selectItems;
		}
		public void setSelectTriggers(String selectTriggers) {
			this.selectTriggers = selectTriggers;
		}
		public String getSelectTriggers() {
			return selectTriggers;
		}
		public void setFilter(Object filter) {
			this.filter = filter;
		}
		public Object getFilter() {
			return filter;
		}
		public void setLimitSelects(Integer limitSelects) {
			this.limitSelects = limitSelects;
		}
		public Integer getLimitSelects() {
			return limitSelects;
		}
		public void setSortfield(List<String> sortfield) {
			this.sortfield = sortfield;
		}
		public List<String> getSortfield() {
			 if(sortfield==null){
				sortfield   = new ArrayList<String>();
				return sortfield;
			}
			 return sortfield;
		}
		public void setCountOutput(Boolean countOutput) {
			this.countOutput = countOutput;
		}
		public Boolean getCountOutput() {
			return countOutput;
		}
		public void setEditable(Boolean editable) {
			this.editable = editable;
		}
		public Boolean getEditable() {
			return editable;
		}
		public void setExcludeSearch(Boolean excludeSearch) {
			this.excludeSearch = excludeSearch;
		}
		public Boolean getExcludeSearch() {
			return excludeSearch;
		}
		public void setLimit(Integer limit) {
			this.limit = limit;
		}
		public Integer getLimit() {
			return limit;
		}
		public void setNodeids(List<String> nodeids) {
			this.nodeids = nodeids;
		}
		public List<String> getNodeids() {
			 if(nodeids==null){
				nodeids   = new ArrayList<String>();
				return nodeids;
			}
			 return nodeids;
		}
		public void setOutput(String output) {
			this.output = output;
		}
		public String getOutput() {
			return output;
		}
		public void setPreservekeys(Boolean preservekeys) {
			this.preservekeys = preservekeys;
		}
		public Boolean getPreservekeys() {
			return preservekeys;
		}
		public void setSearch(Object search) {
			this.search = search;
		}
		public Object getSearch() {
			return search;
		}
		public void setSearchByAny(Boolean searchByAny) {
			this.searchByAny = searchByAny;
		}
		public Boolean getSearchByAny() {
			return searchByAny;
		}
		public void setSearchWildcardsEnabled(Boolean searchWildcardsEnabled) {
			this.searchWildcardsEnabled = searchWildcardsEnabled;
		}
		public Boolean getSearchWildcardsEnabled() {
			return searchWildcardsEnabled;
		}
		public void setSortorder(List<String> sortorder) {
			this.sortorder = sortorder;
		}
		public List<String> getSortorder() {
			 if(sortorder==null){
				sortorder   = new ArrayList<String>();
				return sortorder;
			}
			 return sortorder;
		}
		public void setStartSearch(Boolean startSearch) {
			this.startSearch = startSearch;
		}
		public Boolean getStartSearch() {
			return startSearch;
		}
	}
}
