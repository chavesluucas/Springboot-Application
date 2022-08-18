package tech.techcontrol.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import tech.techcontrol.application.entities.User;

@RestController
public class UserController {

	public ResponseEntity<User> findAll(){
		User client = new User(1L, "Joao", "joao@email.com", "99999", "senah123");
		return ResponseEntity.ok().body(client);
	}
	
}
