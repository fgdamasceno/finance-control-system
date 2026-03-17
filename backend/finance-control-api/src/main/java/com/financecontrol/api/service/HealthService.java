package com.financecontrol.api.service;

import org.springframework.stereotype.Service;

import com.financecontrol.api.dto.ApiResponse;

@Service
public class HealthService {
	
	public ApiResponse getHealtStatus() {
		return new ApiResponse("Finance Control API is running!", true);
	}

}
