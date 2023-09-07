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



# Coffees Table
CREATE TABLE IF NOT EXISTS coffee_items (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    roast TEXT,
    price DECIMAL(5, 2),
    size INT
);

INSERT INTO coffee_items(id, name, roast, price, size)
VALUES (1, 'Death PB and J', 'light', 17.99, 12 ),
        (2, 'Death Ethiopia', 'light',  17.99 , 12),
        (3,  'Death Salted Caramel',  'medium',  17.99 ,12),
        ( 4,  'Death French Toast',  'medium', 17.99, 12),
        (5,  'Death Pumpkin King',  'medium',  17.99, 12)  ,
        (6,  'Death Irish Cream',  'medium',  17.99 , 12) ,
        (7,  'Death Dark Chocolate',  'dark',  17.99, 12)  ,
        (8,  'Death Sumatra', 'dark',  17.99, 12)  ,
        ( 9, 'Death Banana Foster',  'dark',  17.99, 12)

# Users Cart
# CREATE TABLE user_cart (
#     id INT PRIMARY KEY AUTO_INCREMENT,
#     user_id INT, -- Foreign key referencing the 'user' table
#     coffee_id INT, -- Foreign key referencing the 'coffee_items' table
#     quantity INT,
#     -- Add any other necessary cart-related information
#     FOREIGN KEY (user_id) REFERENCES user(id),
#     FOREIGN KEY (coffee_id) REFERENCES coffee_items(id)
# );
