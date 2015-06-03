package com.skycloud.api.domain.usermacro;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class UserMacroGetRequest extends RequestBase{
	public UserMacroGetRequest() {
		super("usermacro.get");
	}
	private UserMacroGetParams params = new UserMacroGetParams();
	public void setParams(UserMacroGetParams params) {
		this.params = params;
	}
	public UserMacroGetParams getParams() {
		return params;
	}
	public static class UserMacroGetParams{
		private Boolean globalmacro;
		private List<String> globalmacroids;
		private List<String> groupids;
		private List<String> hostids;
		private List<String> hostmacroids;
		private List<String> templateids;
		private String selectGroups;
		private String selectHosts;
		private String selectTemplates;
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
		public void setGlobalmacro(Boolean globalmacro) {
			this.globalmacro = globalmacro;
		}
		public Boolean getGlobalmacro() {
			return globalmacro;
		}
		public void setGlobalmacroids(List<String> globalmacroids) {
			this.globalmacroids = globalmacroids;
		}
		public List<String> getGlobalmacroids() {
			 if(globalmacroids==null){
				globalmacroids   = new ArrayList<String>();
				return globalmacroids;
			}
			 return globalmacroids;
		}
		public void setGroupids(List<String> groupids) {
			this.groupids = groupids;
		}
		public List<String> getGroupids() {
			 if(groupids==null){
				groupids   = new ArrayList<String>();
				return groupids;
			}
			 return groupids;
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
		public void setHostmacroids(List<String> hostmacroids) {
			this.hostmacroids = hostmacroids;
		}
		public List<String> getHostmacroids() {
			 if(hostmacroids==null){
				hostmacroids   = new ArrayList<String>();
				return hostmacroids;
			}
			 return hostmacroids;
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
		public void setSelectGroups(String selectGroups) {
			this.selectGroups = selectGroups;
		}
		public String getSelectGroups() {
			return selectGroups;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
		}
		public void setSelectTemplates(String selectTemplates) {
			this.selectTemplates = selectTemplates;
		}
		public String getSelectTemplates() {
			return selectTemplates;
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
