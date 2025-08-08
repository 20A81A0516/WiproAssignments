package com.takehome.billing_app.service;

import com.takehome.billing_app.bean.Product;
import com.takehome.billing_app.dao.ProductDao;
import com.takehome.billing_app.dao.ProductDaoImpl;

public class ProductService {
    private final ProductDao productDao = new ProductDaoImpl();

    public Product getProductDetails(int product_code) throws BillingException {
        return productDao.getProductDetails(product_code);
    }

    public double calculatePrice(int quantity, double product_price) {
        return quantity * product_price;
    }

    /**
     * Validation rule: product_code must be a positive 4-digit number (1000 - 9999)
     */
    public boolean validateProductCode(int product_code) {
        return product_code >= 1000 && product_code <= 9999;
    }

    public boolean validateQuantity(int quantity) {
        return quantity > 0;
    }
}
