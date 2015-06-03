package com.skycloud.api.domain.configuration;
import com.skycloud.api.domain.base.ConfigurationOptions;
import com.skycloud.api.domain.base.RequestBase;
public class ConfigurationExportRequest extends RequestBase{
	public ConfigurationExportRequest() {
		super("configuration.export");
	}
	private ConfigurationExportParams params = new ConfigurationExportParams();
	public void setParams(ConfigurationExportParams params) {
		this.params = params;
	}
	public ConfigurationExportParams getParams() {
		return params;
	}
	public static class ConfigurationExportParams{
		private String format;
		private ConfigurationOptions options;
		public void setFormat(String format) {
			this.format = format;
		}
		public String getFormat() {
			return format;
		}
		public void setOptions(ConfigurationOptions options) {
			this.options = options;
		}
		public ConfigurationOptions getOptions() {
			if(null==options){
				options = new ConfigurationOptions();
			}
			return options;
		}
	}
}
