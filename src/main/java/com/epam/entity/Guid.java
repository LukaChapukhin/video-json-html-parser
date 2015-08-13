package com.epam.entity;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class Guid {

	

	@SerializedName(JsonSchema.IS_PERMA_LINK)
    private String isPermamentLink;
	
	@SerializedName(JsonSchema.CONTENT)
	private String content;
	
	public String getIsPermamentLink() {
		return isPermamentLink;
	}

	public void setIsPermamentLink(String isPermamentLink) {
		this.isPermamentLink = isPermamentLink;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Guid [isPermamentLink=" + isPermamentLink + ", content=" + content + "]";
	}

	
	
	
}
