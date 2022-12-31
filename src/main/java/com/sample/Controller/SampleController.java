package com.sample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class SampleController {
	
	@GetMapping("/string")
	public String getmaping() {
		return "working";
	}

}
