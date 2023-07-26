package com.service.product.controller;

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

import com.service.product.entity.Product;
import com.service.product.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	IProductService productService;
	
	
	@GetMapping("/listar")
	public List<Product> getAllProducts(){
		return productService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Optional<Product> getProduct(@PathVariable Long id){
		return productService.findById(id);
	}
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		productService.delete(id);
	}
	
	@GetMapping("/listar/user/{userId}")
	public List<Product> getProductsByUserId(@PathVariable Long userId){
		return productService.findByUserId(userId);
	}
}
