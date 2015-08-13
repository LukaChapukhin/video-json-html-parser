package com.epam.runner;


import com.epam.constant.ProxyLinks;
import com.epam.entity.AbstractChannel;
import com.epam.exception.TechnicalException;
import com.epam.exception.UrlFormatException;
import com.epam.utils.HtmlPageCreator;
import com.epam.utils.HttpContentReciever;
import com.epam.utils.JsonConverter;
import com.google.gson.JsonSyntaxException;

public class Runner {

	private static final String PATH_TO_TEMPLATE = "src/main/resources/template.ftl";

	public static void main(String[] args) {
		
		String url = null;
		if (args.length == 0) {
			url = ProxyLinks.GET_ALL_VIDEOS;
		} else {
			url = args[0];
		}
		AbstractChannel channel = null;
		String content = null;
		try {
			content = HttpContentReciever.getInstance().recieveContent(url);
			channel = JsonConverter.parseJsonToMultiObject(content);
		} catch (JsonSyntaxException e) {
			try {
				channel = JsonConverter.parseJsonToSingleObject(content);
			} catch (UrlFormatException e1) {

				e1.printStackTrace();
				System.exit(1);

			}

		} catch (UrlFormatException e) {
			e.printStackTrace();
			System.exit(1);
		}

		try {
			HtmlPageCreator.createHtmlTemplate(channel, PATH_TO_TEMPLATE);
		} catch (TechnicalException e) {

			e.printStackTrace();
			System.exit(1);
		}

	}

}
