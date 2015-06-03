package com.skycloud.api.domain.dhost;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class DiscoveredHostGetRequest extends RequestBase{
	public DiscoveredHostGetRequest() {
		super("dhost.get");
	}
	private DiscoveredHostGetParams params = new DiscoveredHostGetParams();
	public void setParams(DiscoveredHostGetParams params) {
		this.params = params;
	}
	public DiscoveredHostGetParams getParams() {
		return params;
	}
	public static class DiscoveredHostGetParams{
		private List<String> dhostids;
		private List<String> druleids;
		private List<String> dserviceids;
		private String selectDRules;
		private String selectDServices;
		private Integer limitSelects;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
		private Object filter;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		public void setDhostids(List<String> dhostids) {
			this.dhostids = dhostids;
		}
		public List<String> getDhostids() {
			 if(dhostids==null){
				dhostids   = new ArrayList<String>();
				return dhostids;
			}
			 return dhostids;
		}
		public void setDruleids(List<String> druleids) {
			this.druleids = druleids;
		}
		public List<String> getDruleids() {
			 if(druleids==null){
				druleids   = new ArrayList<String>();
				return druleids;
			}
			 return druleids;
		}
		public void setDserviceids(List<String> dserviceids) {
			this.dserviceids = dserviceids;
		}
		public List<String> getDserviceids() {
			 if(dserviceids==null){
				dserviceids   = new ArrayList<String>();
				return dserviceids;
			}
			 return dserviceids;
		}
		public void setSelectDRules(String selectDRules) {
			this.selectDRules = selectDRules;
		}
		public String getSelectDRules() {
			return selectDRules;
		}
		public void setSelectDServices(String selectDServices) {
			this.selectDServices = selectDServices;
		}
		public String getSelectDServices() {
			return selectDServices;
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
		public void setFilter(Object filter) {
			this.filter = filter;
		}
		public Object getFilter() {
			return filter;
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
