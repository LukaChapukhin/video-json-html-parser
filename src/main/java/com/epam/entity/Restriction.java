package com.epam.entity;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class Restriction {

	
	@SerializedName(JsonSchema.RELATIONSHIP)
	private String relationship;
	
	@SerializedName(JsonSchema.TYPE)
	private String type;

	@SerializedName(JsonSchema.CONTENT)
	private String content;
	
	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Restriction [relationship=" + relationship + ", type=" + type + ", content=" + content + "]";
	}

	
	
	
	
	

}
