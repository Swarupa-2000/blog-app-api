package com.blog.services;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {
	UserDto registerNewUser(UserDto user);
	UserDto createUser(UserDto user);
	UserDto updateUSer(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUSers();
	void deleteUser(Integer userId);
}
