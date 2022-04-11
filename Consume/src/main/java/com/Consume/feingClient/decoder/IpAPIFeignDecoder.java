package com.Consume.feingClient.decoder;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import com.Consume.constants.Constanst;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IpAPIFeignDecoder implements ErrorDecoder{
	public static final String UNKNOWN_ERROR = "unknown error";
	public static final String LOCATION = "IpAPI";

	@Override
	public Exception decode(String methodKey, Response response) {
		log.error("method key" + methodKey);
		log.error("Response body: " + response.body() + "\nStatus: " + response.status() + "\nReason: "
				+ response.reason());
		Gson gson = new Gson();
		String content = Constanst.Empty_STR;
		try {
			content = IOUtils.toString(response.body().asInputStream());
			ErrorResponse error = gson.fromJson(content, ErrorResponse.class);
			switch (response.status()) {
			case Constanst.BAD_REQUEST:
				return new FileNotFoundException("Code: " + response.status() + "\\nmore info: " + error.getMoreInfo()
						+ "\nDetails: " + error.getDetails());
			case Constanst.UNAUTHORIZED:
				return new FileNotFoundException("Code: " + response.status() + "\nmore info: " + error.getMoreInfo()
						+ "\nDetails: " + error.getDetails());
			case Constanst.NOT_FOUND:
				return new FileNotFoundException("Code: " + response.status() + "\nmore info: " + error.getMoreInfo()
						+ "\nDetails: " + error.getDetails());
			case Constanst.INTERNAL_SERVER_ERROR:
				return new FileNotFoundException("Code: " + response.status() + "\nmore info: " + error.getMoreInfo()
						+ "\nDetails: " + error.getDetails());
			default:
				return new FileNotFoundException("Code: " + response.status() + "\nmore info: " + error.getMoreInfo()
						+ "\nDetails: " + error.getDetails());
			}
		} catch (IOException | JsonSyntaxException ioe) {
			log.error(UNKNOWN_ERROR, ioe.getMessage(),LOCATION);
		}
		return null;
	}
}
