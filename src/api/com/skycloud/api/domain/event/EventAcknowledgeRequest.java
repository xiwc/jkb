package com.skycloud.api.domain.event;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Event;
import com.skycloud.api.domain.base.RequestBase;
public class EventAcknowledgeRequest extends RequestBase{
	public EventAcknowledgeRequest() {
		super("event.acknowledge");
	}
	private EventAcknowledgeParams params = new EventAcknowledgeParams();
	public void setParams(EventAcknowledgeParams params) {
		this.params = params;
	}
	public EventAcknowledgeParams getParams() {
		return params;
	}
	public static class EventAcknowledgeParams extends Event{
		private List<String> eventids;
		private String message;
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
		public void setMessage(String message) {
			this.message = message;
		}
		public String getMessage() {
			return message;
		}
	}
}
