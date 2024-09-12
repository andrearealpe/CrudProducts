/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.hyunseda.market.service;

import co.com.hyunseda.market.access.domain.Product;

/**
 *
 * @author earea
 */
public class ProductValidator implements IProductValidator {
    @Override
    public boolean isValid(Product product) {
        return product != null && !product.getName().isEmpty();
    }
}
