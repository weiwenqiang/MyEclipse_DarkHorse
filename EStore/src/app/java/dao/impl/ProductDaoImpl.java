package app.java.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import app.java.bean.Product;
import app.java.dao.ProductDao;
import app.java.utils.JDBCUtils;

public class ProductDaoImpl implements ProductDao {

	private QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
	
	public boolean addProduct(Product product) {
		try {
			String sql = "INSERT INTO product VALUES(NULL,?,?,?,?,?,?,?)";
			int index = runner.update(sql, product.getName(), product.getCategory(),
					product.getMarketprice(), product.getEstoreprice(),
					product.getPnum(), product.getImgurl(),
					product.getDescription());
			if(index > 0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Product> findProduct() {
		try {
			String sql = "SELECT * FROM product";
			List<Product> products = runner.query(sql, new BeanListHandler<Product>(Product.class));
			return products;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Product findProductById(int id) {
		try {
			String sql = "SELECT * FROM product WHERE id=?";
			Product product = runner.query(sql, new BeanHandler<Product>(Product.class), id);
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
