package co.com.hyunseda.market.service;

import co.com.hyunseda.market.access.domain.Product;
import co.com.hyunseda.market.access.DataBaseManager;
import co.com.hyunseda.market.access.IDataBaseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado
 */

public class ProductService implements IProductService {
    
    private final IDataBaseManager DB;
    private final IProductValidator productValidator;

    public ProductService(IDataBaseManager databaseManager, IProductValidator productValidator) {
        this.DB = databaseManager;
        this.productValidator = productValidator;
    }

    @Override
    public boolean saveProduct(String name, String description) {
        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setDescription(description);

        // Validar
        if (!productValidator.isValid(newProduct)) {
            return false;
        }
        return DB.save(newProduct);
    }

    @Override
    public List<Product> findAllProducts() {
        return DB.findAll();
    }

    @Override
    public Product findProductById(Long id) {
        return DB.findById(id);
    }

    @Override
    public boolean deleteProduct(Long id) {
        return DB.delete(id);
    }

    @Override
    public boolean editProduct(Long productId, Product prod) {
        // Validar
        if (!productValidator.isValid(prod)) {
            return false;
        }
        return DB.edit(productId, prod);
    }
}
