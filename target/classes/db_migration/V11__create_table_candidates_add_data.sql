CREATE TABLE candidates
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    firstname   VARCHAR(255)                            NOT NULL,
    lastname    VARCHAR(255)                            NOT NULL,
    status      VARCHAR(255)                            NOT NULL,
    contact     VARCHAR(255)                            NOT NULL,
    responsible VARCHAR(255),
    vacancy     VARCHAR(255)                            NOT NULL,
    commentary  VARCHAR(255),
    CONSTRAINT pk_candidates PRIMARY KEY (id)
);

INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Смирнов', 'Рома', 'Открыта', '+7 (999) 233-22-41', 'Тимофеев К.А.', 'Администратор', 'Берем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Петров', 'Александр', 'Открыта', '+7 (999) 233-22-42', 'Беляев К.А.', 'Менеджер по продажам', 'Берем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Романов', 'Илья', 'Открыта', '+7 (999) 233-22-43', 'Тимофеев К.А.', 'Python разработчик', 'Собеседуем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Тимофеев', 'Анатолий', 'Открыта', '+7 (999) 233-22-44', 'Ильин К.А.', 'Администратор', 'Берем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Соколов', 'Семен', 'Открыта', '+7 (999) 233-22-45', 'Гусев К.А.', 'Developer Python', 'Тестируем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Долгин', 'Аркадий', 'Открыта', '+7 (999) 233-22-46', 'Тимофеев К.А.', 'Администратор', 'Берем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Мамонтов', 'Валентин', 'Открыта', '+7 (999) 233-22-47', 'Тимофеев К.А.', 'Менеджер по продажам', 'Берем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Волков', 'Василий', 'Открыта', '+7 (999) 233-22-48', 'Тимофеев К.А.', 'Администратор', 'Тестируем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Коновалов', 'Виктор', 'Открыта', '+7 (999) 233-22-49', 'Федоров К.А.', 'Developer Python', 'Берем');
INSERT INTO candidates (firstname, lastname, status, contact, responsible, vacancy, commentary) VALUES ('Кириллов', 'Рома', 'Открыта', '+7 (999) 233-22-54', 'Попов К.А.', 'Администратор', 'Тестируем');