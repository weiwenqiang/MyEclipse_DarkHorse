package app.java.dao;

import java.util.List;

import app.java.bean.Product;

public interface ProductDao {

	public boolean addProduct(Product product);

	public List<Product> findProduct();

	public Product findProductById(int id);

}
