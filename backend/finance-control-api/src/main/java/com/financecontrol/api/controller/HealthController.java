package com.financecontrol.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financecontrol.api.dto.ApiResponse;
import com.financecontrol.api.service.HealthService;

@RestController
public class HealthController {
	
	private final HealthService healthService;
	
	public HealthController(HealthService healthService) {
		this.healthService = healthService;
	}
	
	@GetMapping("/health")
	public ApiResponse health() {
		return healthService.getHealtStatus();
	}

}
