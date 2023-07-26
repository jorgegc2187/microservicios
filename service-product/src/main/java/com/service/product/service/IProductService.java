package com.service.product.service;

import java.util.List;
import java.util.Optional;

import com.service.product.entity.Product;

public interface IProductService {
	List<Product> findAll();
	List<Product> findByUserId(Long id);
	Optional<Product> findById(Long id);
	Product saveProduct(Product product);
	void delete(Long id);
}
