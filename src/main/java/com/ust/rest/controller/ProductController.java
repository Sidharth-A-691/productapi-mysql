package com.ust.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Product;
import com.ust.rest.service.ProductService;

@RestController
@RequestMapping("/product/api1.0") //root of the resource or controller
public class ProductController {
	
	
//	@GetMapping(value = "/product/{id}")
//	public ResponseEntity<Product> getById(@PathVariable long id)
//	{
//		Optional<Product> optional = productsList.stream().filter(product->product.getProductId()==id).findFirst();
//		return ResponseEntity.status(HttpStatus.OK).body(optional.get());
//	}
	
	Logger logger = Logger.getLogger("ProductController.class");
	
//	
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/product/{brand}")
	public ResponseEntity<Product> getByBrand(@PathVariable String brand)
	{
		return null;
	}
	
	
	@GetMapping(value="/productsinfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>>displayProducts()
	{
		return null;
	}
	
	
	@PostMapping(value="/addProduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		logger.info("Entered POST method"+product);
		Product savedProduct = service.addProduct(product);
		logger.info("Persisted product"+savedProduct);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedProduct);
	}
	
	
	@PutMapping(value="/modify", consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product>updateProduct(@RequestBody Product product)
	{
		return null;	
	}
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<Product>deleteProduct(@PathVariable long id)
	{
		return null;
	}
}
	







//	@GetMapping("/status")
//	public String status()
//	{
//		return "Up and Running!!";
//	}
//	
//	@GetMapping("/time")
//	public String time()
//	{
//		return new java.util.Date().getTime()+"";
//	}

