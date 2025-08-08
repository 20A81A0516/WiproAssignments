package com.takehome.billing_app.dao;

import com.takehome.billing_app.bean.Product;
import com.takehome.billing_app.service.BillingException;

public interface ProductDao {
    Product getProductDetails(int product_code) throws BillingException;
}
