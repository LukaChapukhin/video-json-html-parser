package com.epam.entity;



import com.epam.constant.JsonSchema;
import com.google.gson.annotations.SerializedName;

public class ChannelSingleItem extends AbstractChannel {
	

	@SerializedName(JsonSchema.ITEM)
	private Item items;

	

	public Item getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ChannelSingleItem [items=" + items + "]";
	}
	
	
	

}
