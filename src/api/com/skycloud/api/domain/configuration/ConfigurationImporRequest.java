package com.skycloud.api.domain.configuration;
import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.Rule;
public class ConfigurationImporRequest extends RequestBase{
	public ConfigurationImporRequest() {
		super("configuration.import");
	}
	private ConfigurationImporParams params = new ConfigurationImporParams();
	public void setParams(ConfigurationImporParams params) {
		this.params = params;
	}
	public ConfigurationImporParams getParams() {
		return params;
	}
	public static class ConfigurationImporParams{
		private String format;
		private String source;
		private Rule rules;
		public void setFormat(String format) {
			this.format = format;
		}
		public String getFormat() {
			return format;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getSource() {
			return source;
		}
		public void setRules(Rule rules) {
			this.rules = rules;
		}
		public Rule getRules() {
			if(null==rules){
				rules = new Rule();
			}
			return rules;
		}
	}
}
