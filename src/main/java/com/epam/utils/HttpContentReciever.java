package com.epam.utils;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.epam.exception.UrlFormatException;

public class HttpContentReciever {

	private static volatile HttpContentReciever instance;

	private static final Lock lock = new ReentrantLock();

	private HttpContentReciever() {

	}

	public static HttpContentReciever getInstance() {

		if (instance == null) {
			try {
				lock.lock();
				if (instance == null) {
					instance = new HttpContentReciever();
				}
			} finally {
				lock.unlock();
			}
		}

		return instance;
	}

	public String recieveContent(String url) throws UrlFormatException {

		String result;

		if (url == null || url.isEmpty()) {

			throw new UrlFormatException("Bad url argument!");
		}

		try {
			result = responseContentToString(getHttpResponse(url));
		} catch (IOException e) {
			throw new UrlFormatException("Bad url argument!");
		}

		return result;

	}

	private HttpResponse getHttpResponse(String url) throws IOException {

		HttpClient client = HttpClientBuilder.create().build();
		return client.execute(new HttpGet(url));

	}

	private String responseContentToString(HttpResponse response) throws IOException {

		return IOUtils.toString(response.getEntity().getContent());
	}

}
