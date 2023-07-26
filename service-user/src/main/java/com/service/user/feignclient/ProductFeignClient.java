package com.service.user.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.service.user.model.Product;


@FeignClient(name = "service-product", url = "http://localhost:8002/product")
public interface ProductFeignClient {
	
	@PostMapping("/save")
	Product saveProduct(@RequestBody Product product);
	
	@GetMapping("/listar/user/{userId}")
	List<Product> getProductsByUserId(@PathVariable Long userId);
}
