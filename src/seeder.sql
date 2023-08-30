USE coffee_db;

CREATE TABLE user (
                      id INT PRIMARY KEY,
                      username VARCHAR(50),
                      fname VARCHAR(50),
                      lname VARCHAR(50),
                      email VARCHAR(100),
                      password VARCHAR(100),
                      confpassword VARCHAR(100),
                      address VARCHAR(255),
                      address2 VARCHAR(255),
                      city VARCHAR(50),
                      state VARCHAR(50),
                      zip VARCHAR(20)
);


INSERT INTO user (id, username, fname, lname, email, password, confpassword, address, address2, city, state, zip)
VALUES (1, 'jdev', 'john', 'appleseed', 'jappleseed@gmail.com', 'test', 'test', '123 east main street', 'apt 123', 'Nashville', 'TN', '11111');