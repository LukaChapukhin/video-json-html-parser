package com.epam.entity;


import java.util.List;

import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class ChannelMultiItem extends AbstractChannel {



	@SerializedName(JsonSchema.ITEM)
	private List<Item> items;

	

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ChannelMultiItem [items=" + items + "]";
	}
	
	

	
	
}
