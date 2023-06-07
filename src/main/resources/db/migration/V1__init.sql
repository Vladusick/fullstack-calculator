CREATE TABLE IF NOT EXISTS calculations (
id bigserial PRIMARY KEY,
number_a INT,
number_b INT,
operation VARCHAR(255),
result INT,
secret_key VARCHAR(255));

INSERT INTO calculations (operation, number_a, number_b, result, secret_key)
VALUES
('div', 10, 2, 5, '123123122'),
('add', 1, 1, 2, '123123122'),
('sup', 5, 10, 50, '123123122');
