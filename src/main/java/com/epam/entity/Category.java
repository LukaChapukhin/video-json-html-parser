package com.epam.entity;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class Category {
	
   
	

	@SerializedName(JsonSchema.SCHEME)
	private String scheme;
	
	@SerializedName(JsonSchema.CONTENT)
	private String content;
	
	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	 @Override
		public String toString() {
			return "Category [scheme=" + scheme + ", content=" + content + "]";
		}
	
}
