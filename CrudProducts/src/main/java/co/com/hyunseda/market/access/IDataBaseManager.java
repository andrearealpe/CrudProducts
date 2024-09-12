package co.com.hyunseda.market.access;

import co.com.hyunseda.market.access.domain.Product;
import java.util.List;

/**
 *
 * @author earea
 */
public interface IDataBaseManager {
    boolean save(Product product);
    List<Product> findAll();
    Product findById(Long id);
    boolean edit(Long id, Product product);
    boolean delete(Long id);
}
