package com.epam.entity;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public abstract class AbstractChannel {
	
	@SerializedName(JsonSchema.TITLE)
	private String title;

	@SerializedName(JsonSchema.DESCRIPTION)
	private String description;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AbstractChannel [title=" + title + ", description=" + description + "]";
	}
	
	

}
