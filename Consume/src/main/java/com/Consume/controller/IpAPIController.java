package com.Consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Consume.feingClient.service.impl.*;
import com.Consume.model.Ip;
import com.Consume.model.Root;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/ipAPI")
@CrossOrigin(origins = "*")
@Slf4j
public class IpAPIController {
	
	@Autowired
	private IpAPIServiceImpl ipAPIServiceImpl;
	
	@PostMapping("/consume")
	public ResponseEntity<Root> cosume(@RequestBody Ip ip){
		log.debug(ip + "Controller");
		Root response = ipAPIServiceImpl.cosumesIpAPI(ip.getIp());
		log.debug("termino controllador");
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
