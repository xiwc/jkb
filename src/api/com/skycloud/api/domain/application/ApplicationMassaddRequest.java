package com.skycloud.api.domain.application;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Application;
import com.skycloud.api.domain.base.Item;
import com.skycloud.api.domain.base.RequestBase;
public class ApplicationMassaddRequest extends RequestBase{
	public ApplicationMassaddRequest() {
		super("application.massadd");
	}
	private ApplicationMassaddParams params = new ApplicationMassaddParams();
	public void setParams(ApplicationMassaddParams params) {
		this.params = params;
	}
	public ApplicationMassaddParams getParams() {
		return params;
	}
	public static class ApplicationMassaddParams{
		private List<Application> applications;
		private List<Item> items;
		public void setApplications(List<Application> applications) {
			this.applications = applications;
		}
		public List<Application> getApplications() {
			 if(applications==null){
				applications   = new ArrayList<Application>();
				return applications;
			}
			 return applications;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		public List<Item> getItems() {
			 if(items==null){
				items   = new ArrayList<Item>();
				return items;
			}
			 return items;
		}
	}
}
