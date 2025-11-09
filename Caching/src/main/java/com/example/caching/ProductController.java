package com.example.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable int id) {
		return service.getProductById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
