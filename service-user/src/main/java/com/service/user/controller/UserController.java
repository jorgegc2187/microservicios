package com.service.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.user.entity.User;
import com.service.user.model.Product;
import com.service.user.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/listar")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Optional<User> getUser(@PathVariable Long id){
		return userService.findById(id);
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.delete(id);
	}
	
	@PostMapping("/saveproduct/{userId}")
	public Product saveProduct(@PathVariable Long userId, @RequestBody Product product) {
		return userService.saveProduct(userId, product);
	}
}
