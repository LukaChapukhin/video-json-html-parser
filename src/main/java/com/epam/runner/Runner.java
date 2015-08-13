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
		
		StringBuilder url = new StringBuilder();
		String idType = null;
		if (args.length < 2) {
			url.append(ProxyLinks.GET_ALL_VIDEOS);
		} else {
			
			idType = args[0];
			
			 switch (idType) {
	            case "full":  
	            	url.append(ProxyLinks.GET_VIDEO_BY_FULL_ID);
	            	url.append(args[1]);
	                     break;
	            case "short":  
	            	url.append(ProxyLinks.GET_VIDEO_BY_SHORT_ID);
	            	url.append(args[1]);
	                     break;
	            default: 
	            	url.append(ProxyLinks.GET_ALL_VIDEOS);
	                     break;
	        }
			 System.out.println(url); 
		}
		AbstractChannel channel = null;
		String content = null;
		try {
			content = HttpContentReciever.getInstance().recieveContent(url.toString());
			channel = JsonConverter.parseJsonToMultiObject(content);
		} catch (JsonSyntaxException e) {
			try {
				channel = JsonConverter.parseJsonToSingleObject(content);
			} catch (UrlFormatException|JsonSyntaxException e1) {

				System.out.println("Invalid parameter!");
				System.exit(1);

			}

		} catch (UrlFormatException e) {
			System.out.println("Invalid parameter!");
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
