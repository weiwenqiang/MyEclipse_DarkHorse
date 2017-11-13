package app.java.service;

import java.util.List;

import app.java.bean.Product;

public interface ProductService {

	public boolean addProduct(Product product);

	public List<Product> findProduct();

	public Product findProductById(int id);

}
