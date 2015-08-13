package com.epam.entity;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class Group {
	
	 @SerializedName(JsonSchema.TITLE)
     private String title;
	
    @SerializedName(JsonSchema.COPYRIGHT)
	private String copyright;
	
    @SerializedName(JsonSchema.KEYWORDS)
	private String keywords;
	
    @SerializedName(JsonSchema.THUMBNAIL)
	private String thumbnail;
	
    @SerializedName(JsonSchema.CONTENT)
	private Content content;
	
    @SerializedName(JsonSchema.RESTRICTION)
	private Restriction restriction;
	
    @SerializedName(JsonSchema.CATEGORY)
	private Category category;
	
    @SerializedName(JsonSchema.VALID)
	private String valid;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Restriction getRestriction() {
		return restriction;
	}

	public void setRestriction(Restriction restriction) {
		this.restriction = restriction;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "Group [title=" + title + ", copyright=" + copyright + ", keywords=" + keywords + ", thumbnail="
				+ thumbnail + ", content=" + content + ", restriction=" + restriction + ", category=" + category
				+ ", valid=" + valid + "]";
	}

	
	
	
	

}
