package com.epam.entity;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class Content {
	
	@SerializedName(JsonSchema.MEDIUM)
	private String medium;
	
	@SerializedName(JsonSchema.TYPE)
	private String type;
	
	@SerializedName(JsonSchema.URL)
	private String url;
	
	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	  @Override
		public String toString() {
			return "Content [medium=" + medium + ", type=" + type + ", url=" + url + "]";
		}

	
	
}
