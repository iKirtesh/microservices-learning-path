package com.example.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

	private Map<Integer, Product> productDB = new HashMap<>();

	@Cacheable(value = "products", key = "#id")
	public Product getProductById(int id) {
		System.out.println("Fetching from DB..."); // To test caching
		return productDB.get(id);
	}

	@CachePut(value = "products", key = "#product.id")
	public Product addProduct(Product product) {
		productDB.put(product.getId(), product);
		return product;
	}

	@CacheEvict(value = "products", key = "#id")
	public String deleteProduct(int id) {
		productDB.remove(id);
		return "Product removed from cache and DB.";
	}
}
