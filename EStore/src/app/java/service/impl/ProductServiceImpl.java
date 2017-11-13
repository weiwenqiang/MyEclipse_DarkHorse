package app.java.service.impl;

import java.util.List;

import app.java.bean.Product;
import app.java.dao.ProductDao;
import app.java.dao.impl.ProductDaoImpl;
import app.java.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao = new ProductDaoImpl();
	
	public boolean addProduct(Product product) {
		boolean flag = productDao.addProduct(product);
		return flag;
	}

	public List<Product> findProduct() {
		List<Product> products = productDao.findProduct();
		return products;
	}

	public Product findProductById(int id) {
		Product product = productDao.findProductById(id);
		return product;
	}

}
