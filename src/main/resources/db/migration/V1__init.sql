CREATE TABLE IF NOT EXISTS calculations (id bigserial PRIMARY KEY, operation VARCHAR(255),
result INT, secret_key VARCHAR(255));

INSERT INTO calculations (operation, result, secret_key)
VALUES
('div', 100, '123123122'),
('add', 80, '123123122'),
('sup', 90, '123123122');
