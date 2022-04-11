package com.Consume.feingClient.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Consume.feingClient.IpAPI;
import com.Consume.model.Root;
import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class IpAPIServiceImpl {
	
	@Autowired
	private IpAPI ipAPI;
	
	public Root cosumesIpAPI(String ip) {
		log.debug(ip);
		Root response = new Gson().fromJson(ipAPI.cosumesIpAPI(ip), Root.class);
		log.debug("termino");
		return response;
	}
}
