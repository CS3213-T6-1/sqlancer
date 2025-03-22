CREATE TABLE users (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    email TEXT UNIQUE,
    created_at TEXT DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO users (name, email) VALUES ('User 1', 'user1@example.com');
INSERT INTO users (name, email) VALUES ('User 2', 'user2@example.com');

CREATE TABLE orders (
    id INTEGER PRIMARY KEY,
    user_id INTEGER NOT NULL,
    amount REAL NOT NULL,
    status TEXT CHECK(status IN ('pending', 'completed', 'cancelled')),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO orders (user_id, amount, status) VALUES (1, 100.50, 'pending');
INSERT INTO orders (user_id, amount, status) VALUES (2, 75.25, 'completed');