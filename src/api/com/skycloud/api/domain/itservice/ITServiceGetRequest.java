package com.skycloud.api.domain.itservice;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class ITServiceGetRequest extends RequestBase{
	public ITServiceGetRequest() {
		super("service.get");
	}
	private ITServiceGetParams params = new ITServiceGetParams();
	public void setParams(ITServiceGetParams params) {
		this.params = params;
	}
	public ITServiceGetParams getParams() {
		return params;
	}
	public static class ITServiceGetParams{
		private List<String> serviceids;
		private List<String> parentids;
		private List<String> childids;
		private String selectParent;
		private String selectDependencies;
		private String selectParentDependencies;
		private String selectTimes;
		private String selectAlarms;
		private String selectTrigger;
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
		public void setServiceids(List<String> serviceids) {
			this.serviceids = serviceids;
		}
		public List<String> getServiceids() {
			 if(serviceids==null){
				serviceids   = new ArrayList<String>();
				return serviceids;
			}
			 return serviceids;
		}
		public void setParentids(List<String> parentids) {
			this.parentids = parentids;
		}
		public List<String> getParentids() {
			 if(parentids==null){
				parentids   = new ArrayList<String>();
				return parentids;
			}
			 return parentids;
		}
		public void setChildids(List<String> childids) {
			this.childids = childids;
		}
		public List<String> getChildids() {
			 if(childids==null){
				childids   = new ArrayList<String>();
				return childids;
			}
			 return childids;
		}
		public void setSelectParent(String selectParent) {
			this.selectParent = selectParent;
		}
		public String getSelectParent() {
			return selectParent;
		}
		public void setSelectDependencies(String selectDependencies) {
			this.selectDependencies = selectDependencies;
		}
		public String getSelectDependencies() {
			return selectDependencies;
		}
		public void setSelectParentDependencies(String selectParentDependencies) {
			this.selectParentDependencies = selectParentDependencies;
		}
		public String getSelectParentDependencies() {
			return selectParentDependencies;
		}
		public void setSelectTimes(String selectTimes) {
			this.selectTimes = selectTimes;
		}
		public String getSelectTimes() {
			return selectTimes;
		}
		public void setSelectAlarms(String selectAlarms) {
			this.selectAlarms = selectAlarms;
		}
		public String getSelectAlarms() {
			return selectAlarms;
		}
		public void setSelectTrigger(String selectTrigger) {
			this.selectTrigger = selectTrigger;
		}
		public String getSelectTrigger() {
			return selectTrigger;
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
