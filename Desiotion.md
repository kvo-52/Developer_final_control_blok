## Решение
1. Команды Bash \
cat > "Home animals"\
Dogs\
Cats\
Mouse

'Ctrl+d'\
cat > "Pack animals"\
Camels\
Horse\
Donkeys

'Ctrl+d'\
cat "Home animals" "ack animals" > Animals\
cat Animals\
mv "Animals" "Friands people"


2. Команды Bash \
mkdir new_Animals\
mv 'Friands people' new_Animals/\
ls\
cd new_Animals/\
ls

3. Команды Bash \
sudo apt-get update\
sudo apt update\
sudo apt install mysql-server\
sudo service mysql status

4. Команды Bash 
wget http://ftp.us.debian.org/debian/pool/main/s/sl/sl_5.02-1_amd64.deb\
sudo dpkg -i sl_5.02-1_amd64.deb\
sudo dpkg -r sl

5. Команды Bash
history


6.  docker run -d --name kvo_mysql -e MYSQL_ROOT_PASSWORD=1234 mysql\
Проверяем: docker ps -a\ 

Используем команду "mysql" внутри контейнера MySQL:\
docker exec -it my_mysql mysql -u root -p\
Вводим пароль\
После ввода пароля можно выполнить SQL-запросы для создания схемы, таблиц и заполнения их данными:

CREATE DATABASE Друзья_человека;


8. SQL запросы 

CREATE TABLE Родительский_класс (
  id INT PRIMARY KEY AUTO_INCREMENT,
  тип VARCHAR(50)
);


CREATE TABLE Домашние_животные (
  id INT PRIMARY KEY,
  вид VARCHAR(50),
  FOREIGN KEY (id) REFERENCES Родительский_класс(id)
);


CREATE TABLE Собаки (
  id INT PRIMARY KEY,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  FOREIGN KEY (id) REFERENCES Домашние_животные(id)
);


CREATE TABLE Кошки (
  id INT PRIMARY KEY,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  FOREIGN KEY (id) REFERENCES Домашние_животные(id)
);


CREATE TABLE Хомяки (
  id INT PRIMARY KEY,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  FOREIGN KEY (id) REFERENCES Домашние_животные(id)
);


CREATE TABLE Вьючные_животные (
  id INT PRIMARY KEY,
  вид VARCHAR(50),
  FOREIGN KEY (id) REFERENCES Родительский_класс(id)
);


CREATE TABLE Лошади (
  id INT PRIMARY KEY,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  FOREIGN KEY (id) REFERENCES Вьючные_животные(id)
);


CREATE TABLE Верблюды (
  id INT PRIMARY KEY,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  FOREIGN KEY (id) REFERENCES Вьючные_животные(id)
);


CREATE TABLE Ослы (
  id INT PRIMARY KEY,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  FOREIGN KEY (id) REFERENCES Вьючные_животные(id)
);

show databases;
show tables;

9. SQL запросы 
INSERT INTO Верблюды ( имя, команда, дата_рождения)
VALUES ('Зефир', 'Но, пошел', '2019-09-01'),
       ('Багдад', 'На месте' '2020-11-12'),
       ('Скорость', 'Ждать' '2021-04-05');

INSERT INTO Кошки ( имя, команда, дата_рождения)
VALUES ('Маркиз', 'Кис-кис', '2021-01-20'),
       ('Снежка', 'Давай играть', '2022-03-08');

INSERT INTO Лошади ( имя, команда, дата_рождения)
VALUES ('Спирит', 'Но', '2020-01-21'),
       ('Воронок', 'Бррррр', '2022-03-08');

INSERT INTO Ослы ( имя, команда, дата_рождения)
VALUES ('Нарик', 'Пошёл', '2019-01-21'),
       ('Степан', 'Стой', '2021-03-08');

INSERT INTO Собаки ( имя, команда, дата_рождения)
VALUES ('Шарик', 'Дай лапу', '2019-01-21'),
       ('Бим', 'Лежать', '2020-03-08');

INSERT INTO Хомяки ( имя, команда, дата_рождения)
VALUES ('Долгожитель', 'Кушать', '2022-01-21'),
       ('Хома', 'Отойди', '2023-03-08');

10. SQL запросы 
TRUNCATE TABLE Верблюды;
CREATE TABLE Парнокопытные AS
SELECT * FROM Лошади
UNION
SELECT * FROM Ослы;

11. SQL запросы
CREATE TABLE Парнокопытные AS
SELECT *, TIMESTAMPDIFF(MONTH, дата_рождения, CURDATE()) AS возраст_в_месяцах
FROM (
    SELECT 'Собаки' AS тип_животного, имя, команда, дата_рождения FROM Собаки
    UNION ALL
    SELECT 'Кошки' AS тип_животного, имя, команда, дата_рождения FROM Кошки
    UNION ALL
    SELECT 'Хомяки' AS тип_животного, имя, команда, дата_рождения FROM Хомяки
    UNION ALL
    SELECT 'Лошади' AS тип_животного, имя, команда, дата_рождения FROM Лошади
    UNION ALL
    SELECT 'Ослы' AS тип_животного, имя, команда, дата_рождения FROM Ослы
) AS животные
WHERE дата_рождения >= DATE_SUB(CURDATE(), INTERVAL 3 YEAR)
AND дата_рождения <= DATE_SUB(CURDATE(), INTERVAL 1 YEAR);

12. SQL запросы
CREATE TABLE Полный_состав AS
SELECT 'Собаки' AS тип_животного, имя, команда, дата_рождения FROM Собаки
UNION ALL
SELECT 'Кошки' AS тип_животного, имя, команда, дата_рождения FROM Кошки
UNION ALL
SELECT 'Хомяки' AS тип_животного, имя, команда, дата_рождения FROM Хомяки
UNION ALL
SELECT 'Лошади' AS тип_животного, имя, команда, дата_рождения FROM Лошади
UNION ALL
SELECT 'Ослы' AS тип_животного, имя, команда, дата_рождения FROM Ослы;

13, 14. , 15. Перейти к коду Java 
