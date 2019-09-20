INSERT INTO product (PRODUCT_ID, name, price,  description, imgPath, numInInventory, category, upc) VALUES
 ('1', 'Box Fan', '100', 'The best fan', 'null', '1', 'HOME', '123456789012'),
  ('2', 'Clean Code', '10', 'By Uncle Bob', 'null', '100', 'BOOKS', '098765432109');
INSERT INTO SHOPPING_CART (ID) VALUES ('1'),('2');
INSERT INTO CUSTOMER (CUSTOMER_ID, FIRST_NAME, LAST_NAME, SHOPPING_CART_ID, EMAIL) VALUES
    ('1', 'John', 'Doe', '1', 'John@fake.com'),
    ('2', 'Jane', 'Doe', '2', 'Jane@fake.com');
INSERT INTO SHOPPING_CART_PRODUCT_QUANTITY_MAP (SHOPPING_CART_ID, PRODUCT_QUANTITY_MAP, PRODUCT_QUANTITY_MAP_KEY ) VALUES
    ('1','1','1'),
    ('1','3','2'),
    ('2', '2', '2');
INSERT INTO ADDRESS (ADDRESS_ID, CITY, COUNTRY, POSTAL_CODE, STATE, STREET_ADDRESS ) VALUES
    ('1', 'AnyTown', 'USA', '12345', 'WA', '123 Fake St');
INSERT INTO CUSTOMER_ADDRESSES (CUSTOMER_CUSTOMER_ID, ADDRESSES_ADDRESS_ID ) VALUES
    ('1', '1'),
    ('2','1');