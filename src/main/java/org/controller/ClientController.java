package org.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import boh.dubbo.server.MyServer;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Reference
	private MyServer myServer;
	
	@RequestMapping("/dubbo")
	public String dubbo() {
		return myServer.server("MySon");
	}

}
