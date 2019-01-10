package com.example.dubbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class CustomController {
	
	@Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
	private IDemoServer aa;

	@GetMapping(value = "/index/{name}")
	public String index(@PathVariable String name) {
		return aa.hello(name);
	}
}
