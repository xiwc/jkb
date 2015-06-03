package com.skycloud.api.domain.alert;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class AlertGetRequest extends RequestBase{
	public AlertGetRequest() {
		super("alert.get");
	}
	private AlertGetParams params = new AlertGetParams();
	public void setParams(AlertGetParams params) {
		this.params = params;
	}
	public AlertGetParams getParams() {
		return params;
	}
	public static class AlertGetParams{
		private List<String> alertids;
		private List<String> actionids;
		private List<String> eventids;
		private List<String> groupids;
		private List<String> hostids;
		private List<String> mediatypeids;
		private List<String> triggerids;
		private List<String> userids;
		private String time_from;
		private String time_till;
		private String selectHosts;
		private String selectMediatypes;
		private String selectUsers;
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
		public void setAlertids(List<String> alertids) {
			this.alertids = alertids;
		}
		public List<String> getAlertids() {
			 if(alertids==null){
				alertids   = new ArrayList<String>();
				return alertids;
			}
			 return alertids;
		}
		public void setActionids(List<String> actionids) {
			this.actionids = actionids;
		}
		public List<String> getActionids() {
			 if(actionids==null){
				actionids   = new ArrayList<String>();
				return actionids;
			}
			 return actionids;
		}
		public void setEventids(List<String> eventids) {
			this.eventids = eventids;
		}
		public List<String> getEventids() {
			 if(eventids==null){
				eventids   = new ArrayList<String>();
				return eventids;
			}
			 return eventids;
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
		public void setMediatypeids(List<String> mediatypeids) {
			this.mediatypeids = mediatypeids;
		}
		public List<String> getMediatypeids() {
			 if(mediatypeids==null){
				mediatypeids   = new ArrayList<String>();
				return mediatypeids;
			}
			 return mediatypeids;
		}
		public void setTriggerids(List<String> triggerids) {
			this.triggerids = triggerids;
		}
		public List<String> getTriggerids() {
			 if(triggerids==null){
				triggerids   = new ArrayList<String>();
				return triggerids;
			}
			 return triggerids;
		}
		public void setUserids(List<String> userids) {
			this.userids = userids;
		}
		public List<String> getUserids() {
			 if(userids==null){
				userids   = new ArrayList<String>();
				return userids;
			}
			 return userids;
		}
		public void setTime_from(String time_from) {
			this.time_from = time_from;
		}
		public String getTime_from() {
			return time_from;
		}
		public void setTime_till(String time_till) {
			this.time_till = time_till;
		}
		public String getTime_till() {
			return time_till;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
		}
		public void setSelectMediatypes(String selectMediatypes) {
			this.selectMediatypes = selectMediatypes;
		}
		public String getSelectMediatypes() {
			return selectMediatypes;
		}
		public void setSelectUsers(String selectUsers) {
			this.selectUsers = selectUsers;
		}
		public String getSelectUsers() {
			return selectUsers;
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
