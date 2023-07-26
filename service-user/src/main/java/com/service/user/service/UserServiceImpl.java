package com.service.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.user.entity.User;
import com.service.user.feignclient.ProductFeignClient;
import com.service.user.model.Product;
import com.service.user.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ProductFeignClient productFeignClient;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public List<Product> findProductsById(Long id) {
		// TODO Auto-generated method stub
		return productFeignClient.getProductsByUserId(id);
	}

	@Override
	public Product saveProduct(Long userId, Product product) {
		product.setUserId(userId);
		return productFeignClient.saveProduct(product);
	}

}
