package com.epam.utils;

import com.epam.constant.JsonSchema;
import com.epam.entity.ChannelMultiItem;
import com.epam.entity.ChannelSingleItem;
import com.epam.exception.UrlFormatException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonConverter {
	
	public static ChannelMultiItem parseJsonToMultiObject(String jsonString) throws UrlFormatException,IllegalStateException {
		JsonObject jsonObject =new Gson().fromJson(jsonString, JsonObject.class); 
		ChannelMultiItem  channel = new Gson().fromJson(getJsonChannelObject(jsonObject), ChannelMultiItem.class);
		return channel;
	}
	
	public static ChannelSingleItem parseJsonToSingleObject(String jsonString) throws UrlFormatException {
		JsonObject jsonObject =new Gson().fromJson(jsonString, JsonObject.class); 
		ChannelSingleItem  channel = new Gson().fromJson(getJsonChannelObject(jsonObject), ChannelSingleItem.class);
		return channel;
	}
	
	private static JsonElement getJsonChannelObject(JsonObject jsonObject) {
		return jsonObject.getAsJsonObject().get(JsonSchema.RSS).getAsJsonObject().get(JsonSchema.CHANNEL);
	}

}
