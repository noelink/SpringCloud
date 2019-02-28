package com.spring.feing.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.feing.api.dto.UserResponse;

@FeignClient(url="http://jsonplaceholder.typicode.com", name="USER-CLIENT")
public interface UserClient {
	
	@GetMapping("/users")
    public List<UserResponse> getUsers();

}
