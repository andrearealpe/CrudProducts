
package co.com.hyunseda.market.service;

import co.com.hyunseda.market.access.domain.Product;
import java.util.List;

/**
 *
 * @author earea
 */

public interface IProductService {
    boolean saveProduct(String name, String description);
    List<Product> findAllProducts();

    Product findProductById(Long id);
    boolean deleteProduct(Long id);
    boolean editProduct(Long id, Product product);
}

