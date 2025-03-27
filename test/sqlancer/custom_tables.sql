CREATE TABLE users (
    id INTEGER PRIMARY KEY,
    name TEXT,
    age INTEGER
);

INSERT INTO users (name, age) VALUES
('Alice', 25),
('Bob', 30),
('Charlie', 35),
('David', 40),
('Eve', 28),
('Frank', 33),
('Grace', 27),
('Hank', 45),
('Ivy', 29),
('Jack', 31);

CREATE TABLE cities (
    id INTEGER PRIMARY KEY,
    city_name TEXT,
    population INTEGER
);

INSERT INTO cities (city_name, population) VALUES
('New York', 8000000),
('Los Angeles', 4000000),
('Chicago', 2700000),
('Houston', 2300000),
('Phoenix', 1700000),
('Philadelphia', 1600000),
('San Antonio', 1500000),
('San Diego', 1400000),
('Dallas', 1300000),
('San Jose', 1000000);

CREATE TABLE products (
    id INTEGER PRIMARY KEY,
    product_name TEXT,
    price REAL
);

INSERT INTO products (product_name, price) VALUES
('Laptop', 999.99),
('Phone', 699.99),
('Tablet', 399.99),
('Monitor', 199.99),
('Keyboard', 49.99),
('Mouse', 29.99),
('Headphones', 79.99),
('Speaker', 89.99),
('Webcam', 59.99),
('Printer', 129.99);

CREATE TABLE countries (
    id INTEGER PRIMARY KEY,
    country_name TEXT,
    capital TEXT
);

INSERT INTO countries (country_name, capital) VALUES
('USA', 'Washington, D.C.'),
('Canada', 'Ottawa'),
('UK', 'London'),
('Germany', 'Berlin'),
('France', 'Paris'),
('Italy', 'Rome'),
('Spain', 'Madrid'),
('Japan', 'Tokyo'),
('China', 'Beijing'),
('Australia', 'Canberra');

CREATE TABLE books (
    id INTEGER PRIMARY KEY,
    title TEXT,
    author TEXT
);

INSERT INTO books (title, author) VALUES
('1984', 'George Orwell'),
('To Kill a Mockingbird', 'Harper Lee'),
('The Great Gatsby', 'F. Scott Fitzgerald'),
('Moby-Dick', 'Herman Melville'),
('War and Peace', 'Leo Tolstoy'),
('Pride and Prejudice', 'Jane Austen'),
('The Catcher in the Rye', 'J.D. Salinger'),
('Crime and Punishment', 'Fyodor Dostoevsky'),
('The Hobbit', 'J.R.R. Tolkien'),
('Brave New World', 'Aldous Huxley');