package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dto.LoginDTO;
import com.example.Dto.UserDTO;
import com.example.Service.UserService;
import com.example.response.LoginResponse;

@RestController
@CrossOrigin



public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(path = "/save")
	public String saveUser(@RequestBody UserDTO userDTO) {
		String id = userService.addUser(userDTO);
		return id;
	}
	@PostMapping(path = "/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
		LoginResponse loginResponse = userService.loginUser(loginDTO);
		return ResponseEntity.ok(loginResponse);
	}


}
