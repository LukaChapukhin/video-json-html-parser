package com.epam.entity;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class Item {

	

	@SerializedName(JsonSchema.TITLE)
    private String title;
	
	@SerializedName(JsonSchema.LINK)
	private String link;
	
	@SerializedName(JsonSchema.GUID)
	private Guid guid;
	
	@SerializedName(JsonSchema.DESCRIPTION)
	private String description;
	
	@SerializedName(JsonSchema.PUB_DATE)
	private String publishDate;
	
	@SerializedName(JsonSchema.GROUP)
	private Group group;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Guid getGuid() {
		return guid;
	}

	public void setGuid(Guid guid) {
		this.guid = guid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", link=" + link + ", guid=" + guid + ", description=" + description
				+ ", publishDate=" + publishDate + ", group=" + group + "]";
	}

	
	
	
	

}
