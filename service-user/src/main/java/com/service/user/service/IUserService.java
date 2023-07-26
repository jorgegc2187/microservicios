package com.service.user.service;

import java.util.List;
import java.util.Optional;

import com.service.user.entity.User;
import com.service.user.model.Product;

public interface IUserService {
	List<User> findAll();
	List<Product> findProductsById(Long userId);
	Optional<User> findById(Long id);
	User saveUser(User user);
	Product saveProduct(Long userId, Product product);
	void delete(Long id);
}
