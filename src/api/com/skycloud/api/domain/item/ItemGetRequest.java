package com.skycloud.api.domain.item;
import com.skycloud.api.domain.base.RequestBase;
public class ItemGetRequest extends RequestBase{
	public ItemGetRequest() {
		super("item.get");
	}
	private ItemGetParams params = new ItemGetParams();
	public void setParams(ItemGetParams params) {
		this.params = params;
	}
	public ItemGetParams getParams() {
		return params;
	}
	public static class ItemGetParams{
		private String itemids;
		private String groupids;
		private String templateids;
		private String hostids;
		private String proxyids;
		private String interfaceids;
		private String graphids;
		private String triggerids;
		private String applicationids;
		private Boolean webitems;
		private String inherited;
		private String templated;
		private String monitored;
		private String group;
		private String host;
		private String application;
		private String with_triggers;
		private String selectHosts;
		private String selectInterfaces;
		private String selectTriggers;
		private String selectGraphs;
		private String selectApplications;
		private String selectDiscoveryRule;
		private String selectItemDiscovery;
		private Object filter;
		private Integer limitSelects;
		private String sortfield;
		private Boolean countOutput;
		private String editable;
		private Boolean excludeSearch;
		private Integer limit;
		private String nodeids;
		private String output;
		private Boolean preservekeys;
		private Object search;
		private String searchByAny;
		private String searchWildcardsEnabled;
		private String sortorder;
		private Boolean startSearch;
		public void setItemids(String itemids) {
			this.itemids = itemids;
		}
		public String getItemids() {
			return itemids;
		}
		public void setGroupids(String groupids) {
			this.groupids = groupids;
		}
		public String getGroupids() {
			return groupids;
		}
		public void setTemplateids(String templateids) {
			this.templateids = templateids;
		}
		public String getTemplateids() {
			return templateids;
		}
		public void setHostids(String hostids) {
			this.hostids = hostids;
		}
		public String getHostids() {
			return hostids;
		}
		public void setProxyids(String proxyids) {
			this.proxyids = proxyids;
		}
		public String getProxyids() {
			return proxyids;
		}
		public void setInterfaceids(String interfaceids) {
			this.interfaceids = interfaceids;
		}
		public String getInterfaceids() {
			return interfaceids;
		}
		public void setGraphids(String graphids) {
			this.graphids = graphids;
		}
		public String getGraphids() {
			return graphids;
		}
		public void setTriggerids(String triggerids) {
			this.triggerids = triggerids;
		}
		public String getTriggerids() {
			return triggerids;
		}
		public void setApplicationids(String applicationids) {
			this.applicationids = applicationids;
		}
		public String getApplicationids() {
			return applicationids;
		}
		public void setWebitems(Boolean webitems) {
			this.webitems = webitems;
		}
		public Boolean getWebitems() {
			return webitems;
		}
		public void setInherited(String inherited) {
			this.inherited = inherited;
		}
		public String getInherited() {
			return inherited;
		}
		public void setTemplated(String templated) {
			this.templated = templated;
		}
		public String getTemplated() {
			return templated;
		}
		public void setMonitored(String monitored) {
			this.monitored = monitored;
		}
		public String getMonitored() {
			return monitored;
		}
		public void setGroup(String group) {
			this.group = group;
		}
		public String getGroup() {
			return group;
		}
		public void setHost(String host) {
			this.host = host;
		}
		public String getHost() {
			return host;
		}
		public void setApplication(String application) {
			this.application = application;
		}
		public String getApplication() {
			return application;
		}
		public void setWith_triggers(String with_triggers) {
			this.with_triggers = with_triggers;
		}
		public String getWith_triggers() {
			return with_triggers;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
		}
		public void setSelectInterfaces(String selectInterfaces) {
			this.selectInterfaces = selectInterfaces;
		}
		public String getSelectInterfaces() {
			return selectInterfaces;
		}
		public void setSelectTriggers(String selectTriggers) {
			this.selectTriggers = selectTriggers;
		}
		public String getSelectTriggers() {
			return selectTriggers;
		}
		public void setSelectGraphs(String selectGraphs) {
			this.selectGraphs = selectGraphs;
		}
		public String getSelectGraphs() {
			return selectGraphs;
		}
		public void setSelectApplications(String selectApplications) {
			this.selectApplications = selectApplications;
		}
		public String getSelectApplications() {
			return selectApplications;
		}
		public void setSelectDiscoveryRule(String selectDiscoveryRule) {
			this.selectDiscoveryRule = selectDiscoveryRule;
		}
		public String getSelectDiscoveryRule() {
			return selectDiscoveryRule;
		}
		public void setSelectItemDiscovery(String selectItemDiscovery) {
			this.selectItemDiscovery = selectItemDiscovery;
		}
		public String getSelectItemDiscovery() {
			return selectItemDiscovery;
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
		public void setSortfield(String sortfield) {
			this.sortfield = sortfield;
		}
		public String getSortfield() {
			return sortfield;
		}
		public void setCountOutput(Boolean countOutput) {
			this.countOutput = countOutput;
		}
		public Boolean getCountOutput() {
			return countOutput;
		}
		public void setEditable(String editable) {
			this.editable = editable;
		}
		public String getEditable() {
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
		public void setNodeids(String nodeids) {
			this.nodeids = nodeids;
		}
		public String getNodeids() {
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
		public void setSearchByAny(String searchByAny) {
			this.searchByAny = searchByAny;
		}
		public String getSearchByAny() {
			return searchByAny;
		}
		public void setSearchWildcardsEnabled(String searchWildcardsEnabled) {
			this.searchWildcardsEnabled = searchWildcardsEnabled;
		}
		public String getSearchWildcardsEnabled() {
			return searchWildcardsEnabled;
		}
		public void setSortorder(String sortorder) {
			this.sortorder = sortorder;
		}
		public String getSortorder() {
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
