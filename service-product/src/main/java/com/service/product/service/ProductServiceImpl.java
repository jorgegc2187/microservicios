package com.service.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.product.entity.Product;
import com.service.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> findByUserId(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findByUserId(id);
	}

}
