package com.example.Service;

import com.example.Dto.LoginDTO;
import com.example.Dto.UserDTO;
import com.example.response.LoginResponse;

public interface UserService {

	String addUser(UserDTO userDTO);
	LoginResponse loginUser(LoginDTO loginDTO);

}
