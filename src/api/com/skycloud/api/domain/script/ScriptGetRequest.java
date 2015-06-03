package com.skycloud.api.domain.script;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class ScriptGetRequest extends RequestBase{
	public ScriptGetRequest() {
		super("script.get");
	}
	private ScriptGetParams params = new ScriptGetParams();
	public void setParams(ScriptGetParams params) {
		this.params = params;
	}
	public ScriptGetParams getParams() {
		return params;
	}
	public static class ScriptGetParams{
		private List<String> nodeids;
		private List<String> groupids;
		private List<String> hostids;
		private List<String> scriptids;
		private List<String> usrgrpids;
		private Integer editable;
		private List<String> filter;
		private List<String> search;
		private Integer searchByAny;
		private Integer startSearch;
		private Integer excludeSearch;
		private Integer searchWildcardsEnabled;
		private String output;
		private String selectGroups;
		private String selectHosts;
		private Integer countOutput;
		private Integer preservekeys;
		private List<String> sortfield;
		private String sortorder;
		private Integer limit;
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
		public void setScriptids(List<String> scriptids) {
			this.scriptids = scriptids;
		}
		public List<String> getScriptids() {
			 if(scriptids==null){
				scriptids   = new ArrayList<String>();
				return scriptids;
			}
			 return scriptids;
		}
		public void setUsrgrpids(List<String> usrgrpids) {
			this.usrgrpids = usrgrpids;
		}
		public List<String> getUsrgrpids() {
			 if(usrgrpids==null){
				usrgrpids   = new ArrayList<String>();
				return usrgrpids;
			}
			 return usrgrpids;
		}
		public void setEditable(Integer editable) {
			this.editable = editable;
		}
		public Integer getEditable() {
			return editable;
		}
		public void setFilter(List<String> filter) {
			this.filter = filter;
		}
		public List<String> getFilter() {
			 if(filter==null){
				filter   = new ArrayList<String>();
				return filter;
			}
			 return filter;
		}
		public void setSearch(List<String> search) {
			this.search = search;
		}
		public List<String> getSearch() {
			 if(search==null){
				search   = new ArrayList<String>();
				return search;
			}
			 return search;
		}
		public void setSearchByAny(Integer searchByAny) {
			this.searchByAny = searchByAny;
		}
		public Integer getSearchByAny() {
			return searchByAny;
		}
		public void setStartSearch(Integer startSearch) {
			this.startSearch = startSearch;
		}
		public Integer getStartSearch() {
			return startSearch;
		}
		public void setExcludeSearch(Integer excludeSearch) {
			this.excludeSearch = excludeSearch;
		}
		public Integer getExcludeSearch() {
			return excludeSearch;
		}
		public void setSearchWildcardsEnabled(Integer searchWildcardsEnabled) {
			this.searchWildcardsEnabled = searchWildcardsEnabled;
		}
		public Integer getSearchWildcardsEnabled() {
			return searchWildcardsEnabled;
		}
		public void setOutput(String output) {
			this.output = output;
		}
		public String getOutput() {
			return output;
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
		public void setCountOutput(Integer countOutput) {
			this.countOutput = countOutput;
		}
		public Integer getCountOutput() {
			return countOutput;
		}
		public void setPreservekeys(Integer preservekeys) {
			this.preservekeys = preservekeys;
		}
		public Integer getPreservekeys() {
			return preservekeys;
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
		public void setSortorder(String sortorder) {
			this.sortorder = sortorder;
		}
		public String getSortorder() {
			return sortorder;
		}
		public void setLimit(Integer limit) {
			this.limit = limit;
		}
		public Integer getLimit() {
			return limit;
		}
	}
}
