package com.erichiroshi.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erichiroshi.course.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {

	User user = new User(1L, "Pedro", "pedro@gmail.com", "999384499", "123456789");
	
	@GetMapping
	public ResponseEntity<User> listAll(){
		return ResponseEntity.ok().body(user);
	}
	
}
