package com.example.dubbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.service.IDemoServer;

@RestController
public class CustomController {

	@Reference
	public IDemoServer aa;

	@GetMapping(value = "/index/{name}")
	public String index(@PathVariable String name) {
		return aa.hello(name);
	}
}
