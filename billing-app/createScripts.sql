-- createScripts.sql
CREATE DATABASE IF NOT EXISTS takehome_db;
USE takehome_db;

CREATE TABLE IF NOT EXISTS product (
  product_code INT PRIMARY KEY,
  product_name VARCHAR(100),
  product_category VARCHAR(100),
  product_description VARCHAR(255),
  product_price DOUBLE
);

-- Sample rows
INSERT INTO product (product_code, product_name, product_category, product_description, product_price)
VALUES
    (1002, 'LEDTV', 'electronics', 'TV', 45000.0),
    (1003, 'REFRIGERATOR', 'electronics', 'Fridge', 35000.0),
    (1004, 'WASHINGMACHINE', 'appliances', 'Front load washer', 25000.0)
AS new
ON DUPLICATE KEY UPDATE 
    product_name = new.product_name,
    product_category = new.product_category,
    product_description = new.product_description,
    product_price = new.product_price;
