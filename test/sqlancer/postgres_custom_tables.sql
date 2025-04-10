CREATE TABLE users (
    id INTEGER,
    name TEXT,
    age INTEGER
);

INSERT INTO users (id, name, age) VALUES
(1, 'Alice', 25),
(2, 'Bob', 30),
(3, 'Charlie', 35),
(4, 'David', 40),
(5, 'Eve', 28),
(6, 'Frank', 33),
(7, 'Grace', 27),
(8, 'Hank', 45),
(9, 'Ivy', 29),
(10, 'Jack', 31);

CREATE TABLE cities (
    id INTEGER,
    city_name TEXT,
    population INTEGER
);

INSERT INTO cities (id, city_name, population) VALUES
(1, 'New York', 8000000),
(2, 'Los Angeles', 4000000),
(3, 'Chicago', 2700000),
(4, 'Houston', 2300000),
(5, 'Phoenix', 1700000),
(6, 'Philadelphia', 1600000),
(7, 'San Antonio', 1500000),
(8, 'San Diego', 1400000),
(9, 'Dallas', 1300000),
(10, 'San Jose', 1000000);

CREATE TABLE products (
    id INTEGER,
    product_name TEXT,
    price REAL
);

INSERT INTO products (id, product_name, price) VALUES
(1, 'Laptop', 999.99),
(2, 'Phone', 699.99),
(3, 'Tablet', 399.99),
(4, 'Monitor', 199.99),
(5, 'Keyboard', 49.99),
(6, 'Mouse', 29.99),
(7, 'Headphones', 79.99),
(8, 'Speaker', 89.99),
(9, 'Webcam', 59.99),
(10, 'Printer', 129.99);

CREATE TABLE countries (
    id INTEGER,
    country_name TEXT,
    capital TEXT
);

INSERT INTO countries (id, country_name, capital) VALUES
(1, 'USA', 'Washington, D.C.'),
(2, 'Canada', 'Ottawa'),
(3, 'UK', 'London'),
(4, 'Germany', 'Berlin'),
(5, 'France', 'Paris'),
(6, 'Italy', 'Rome'),
(7, 'Spain', 'Madrid'),
(8, 'Japan', 'Tokyo'),
(9, 'China', 'Beijing'),
(10, 'Australia', 'Canberra');

CREATE TABLE books (
    id INTEGER,
    title TEXT,
    author TEXT
);

INSERT INTO books (id, title, author) VALUES
(1, '1984', 'George Orwell'),
(2, 'To Kill a Mockingbird', 'Harper Lee'),
(3, 'The Great Gatsby', 'F. Scott Fitzgerald'),
(4, 'Moby-Dick', 'Herman Melville'),
(5, 'War and Peace', 'Leo Tolstoy'),
(6, 'Pride and Prejudice', 'Jane Austen'),
(7, 'The Catcher in the Rye', 'J.D. Salinger'),
(8, 'Crime and Punishment', 'Fyodor Dostoevsky'),
(9, 'The Hobbit', 'J.R.R. Tolkien'),
(10, 'Brave New World', 'Aldous Huxley');
