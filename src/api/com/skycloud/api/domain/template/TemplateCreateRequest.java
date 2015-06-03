package com.skycloud.api.domain.template;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Host;
import com.skycloud.api.domain.base.HostGroup;
import com.skycloud.api.domain.base.Macro;
import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.Template;
public class TemplateCreateRequest extends RequestBase{
	public TemplateCreateRequest() {
		super("template.create");
	}
	private TemplateCreateParams params = new TemplateCreateParams();
	public void setParams(TemplateCreateParams params) {
		this.params = params;
	}
	public TemplateCreateParams getParams() {
		return params;
	}
	public static class TemplateCreateParams extends Template{
		private List<HostGroup> groups;
		private List<Template> templates;
		private List<Macro> macros;
		private List<Host> hosts;
		public void setGroups(List<HostGroup> groups) {
			this.groups = groups;
		}
		public List<HostGroup> getGroups() {
			 if(groups==null){
				groups   = new ArrayList<HostGroup>();
				return groups;
			}
			 return groups;
		}
		public void setTemplates(List<Template> templates) {
			this.templates = templates;
		}
		public List<Template> getTemplates() {
			 if(templates==null){
				templates   = new ArrayList<Template>();
				return templates;
			}
			 return templates;
		}
		public void setMacros(List<Macro> macros) {
			this.macros = macros;
		}
		public List<Macro> getMacros() {
			 if(macros==null){
				macros   = new ArrayList<Macro>();
				return macros;
			}
			 return macros;
		}
		public void setHosts(List<Host> hosts) {
			this.hosts = hosts;
		}
		public List<Host> getHosts() {
			 if(hosts==null){
				hosts   = new ArrayList<Host>();
				return hosts;
			}
			 return hosts;
		}
	}
}
