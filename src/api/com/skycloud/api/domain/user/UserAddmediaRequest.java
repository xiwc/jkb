package com.skycloud.api.domain.user;

import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Media;
import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.User;

public class UserAddmediaRequest extends RequestBase {
	public UserAddmediaRequest() {
		super("user.addmedia");
	}

	private UserAddmediaParams params = new UserAddmediaParams();

	public void setParams(UserAddmediaParams params) {
		this.params = params;
	}

	public UserAddmediaParams getParams() {
		return params;
	}

	public static class UserAddmediaParams extends User {
		private List<Media> medias;
		private List<String> users;

		public void setMedias(List<Media> medias) {
			this.medias = medias;
		}

		public List<Media> getMedias() {
			if (medias == null) {
				medias = new ArrayList<Media>();
				return medias;
			}
			return medias;
		}

		public void setUsers(List<String> users) {
			this.users = users;
		}

		public List<String> getUsers() {
			if (users == null) {
				users = new ArrayList<String>();
				return users;
			}
			return users;
		}
	}
}
