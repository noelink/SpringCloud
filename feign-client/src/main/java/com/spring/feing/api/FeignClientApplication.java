package com.spring.feing.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.feing.api.client.UserClient;
import com.spring.feing.api.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class FeignClientApplication {
	
	@Autowired
    private	UserClient userClient;
	
	@GetMapping("/findAllUsers")
	public List<UserResponse> getAllUsers(){
		return userClient.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}

}
