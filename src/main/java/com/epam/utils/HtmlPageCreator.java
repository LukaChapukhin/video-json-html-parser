package com.epam.utils;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epam.entity.AbstractChannel;
import com.epam.entity.ChannelMultiItem;
import com.epam.entity.ChannelSingleItem;
import com.epam.entity.Item;
import com.epam.exception.TechnicalException;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class HtmlPageCreator {

	public static void createHtmlTemplate(AbstractChannel channel, String pathToTemplate) throws TechnicalException {
		
		if(channel==null){
			throw new TechnicalException();
		}
		
		Configuration cfg = new Configuration();

		try {
		
			Template template = cfg.getTemplate(pathToTemplate);
			Writer out = new OutputStreamWriter(System.out);
			Map<String, Object> data = new HashMap<String, Object>();

			data.put("title", channel.getTitle());
			data.put("description", channel.getDescription());
			List<Item> items=new ArrayList<Item>();
			if (channel.getClass().equals(ChannelMultiItem.class)) {

				ChannelMultiItem channelMultiItem = (ChannelMultiItem) channel;
				 items = channelMultiItem.getItems();
				data.put("items", items);
				
			} else {

				ChannelSingleItem channelSingleItem = (ChannelSingleItem) channel;
				items.add(channelSingleItem.getItems());
				data.put("items", items);
			}
			

			template.process(data, out);

			out.flush();

		} catch (IOException | TemplateException e) {
			e.printStackTrace();
		}

	}

}
