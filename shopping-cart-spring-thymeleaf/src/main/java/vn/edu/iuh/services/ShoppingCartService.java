package vn.edu.iuh.services;

import vn.edu.iuh.exceptions.NotEnoughProductsInStockException;
import vn.edu.iuh.models.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
