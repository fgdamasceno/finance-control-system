package com.financecontrol.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financecontrol.api.dto.ApiResponse;

@RestController
public class HealthController {
	
	@GetMapping("/health")
	public ApiResponse health() {
		return new ApiResponse("Finance Control API is running!", true);
	}

}
