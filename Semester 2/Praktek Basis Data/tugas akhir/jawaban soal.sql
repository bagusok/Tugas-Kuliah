-- Active: 1717548230823@@127.0.0.1@3306@polinemart
USE polinemart;

-- Test Join, Menampilkan product yang flash sale
SELECT products.name as product_name, discounts.name as discount_name, price, discount_in_percent, discount_in_price, price - discount_in_price as total_price FROM discounts INNER JOIN products ON discounts.id_product = products.id_product WHERE discounts.type_discount = "FLASH_SALE"


-- Sorting Product berdasar nama dari desc
SELECT * FROM products ORDER BY name DESC;


-- FILTER harga product antara 300k - 600k
SELECT * FROM products WHERE price BETWEEN 300000 AND 600000;


-- SUB QUERY
SELECT * FROM products WHERE id_product IN (SELECT id_product FROM discounts WHERE type_discount = "FLASH_SALE");
SELECT * FROM products WHERE id_product IN (SELECT id_product FROM orderedproducts);

-- GROUPING
SELECT categories.name, COUNT(id_product) as jml_product FROM categories INNER JOIN products ON categories.id_category = products.id_category GROUP BY categories.name;


-- HIMPUNAN EXCEPT
SELECT name as product_name FROM shopping_carts INNER JOIN products ON shopping_carts.productsIdProduct = products.id_product;
SELECT name as product_name FROM products EXCEPT SELECT name as product_shoping FROM shopping_carts INNER JOIN products ON shopping_carts.productsIdProduct = products.id_product;

-- AGGREGATE
SELECT SUM(price) as total_price FROM products;
SELECT AVG(price) FROM products;

SELECT SUM(total_price) FROM historyorder WHERE id_user = 1;