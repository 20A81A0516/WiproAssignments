package com.takehome.billing_app.dao;

import com.takehome.billing_app.bean.Product;
import com.takehome.billing_app.service.BillingException;
import com.takehome.billing_app.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDao {

    private static final String SELECT_SQL =
            "SELECT product_code, product_name, product_category, product_description, product_price FROM product WHERE product_code = ?";

    @Override
    public Product getProductDetails(int product_code) throws BillingException {
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_SQL)) {

            ps.setInt(1, product_code);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Product p = new Product();
                    p.setProduct_code(rs.getInt("product_code"));
                    p.setProduct_name(rs.getString("product_name"));
                    p.setProduct_category(rs.getString("product_category"));
                    p.setProduct_description(rs.getString("product_description"));
                    p.setProduct_price(rs.getDouble("product_price"));
                    return p;
                } else {
                    throw new BillingException("Product not found for code: " + product_code);
                }
            }
        } catch (SQLException e) {
            throw new BillingException("Database error: " + e.getMessage());
        }
    }
}
