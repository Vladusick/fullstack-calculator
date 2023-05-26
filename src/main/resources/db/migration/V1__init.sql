CREATE TABLE IF NOT EXISTS results (id bigserial PRIMARY KEY, operation VARCHAR(255),
result INT, secret_key VARCHAR(255));

INSERT INTO results (operation, result, secret_key)
VALUES
('div', 100, '123123122'),
('add', 80, '123123122'),
('sup', 90, '123123122');
