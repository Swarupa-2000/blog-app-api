package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Data
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4,message = "Username must be more than 4 characters")
	private String name;
	
	@Email(message = "Email address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10,message = "Password must min of 3 and max of 10 chars")
	private String password;
	
	@NotEmpty
	private String about;
	
	private String jwtToken;
	
	private Set<RoleDto> roles = new HashSet<>();
}
