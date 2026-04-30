BEGIN;

CREATE TABLE doctor(
	id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	surname VARCHAR(255) NOT NULL,
	phone VARCHAR(255) NOT NULL,
	login VARCHAR(255) NOT NULL,
	password TEXT NOT NULL
);

CREATE TABLE customer(
	id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	surname VARCHAR(255) NOT NULL,
	phone VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL
);

CREATE TABLE service(
	id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	title VARCHAR(255) NOT NULL
);

CREATE TABLE appointment(
	id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	date_appt DATE NOT NULL,
	status VARCHAR(255) DEFAULT 'Новая',
	doctor_id BIGINT NOT NULL,
	service_id BIGINT NOT NULL,
	customer_id BIGINT NOT NULL,
	CONSTRAINT fk_doctor_appt FOREIGN KEY (doctor_id) REFERENCES doctor (id),
	CONSTRAINT fk_service_appt FOREIGN KEY (service_id) REFERENCES service (id),
	CONSTRAINT fk_customer_appt FOREIGN KEY (customer_id) REFERENCES customer (id)
);

CREATE TABLE pet(
	id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nickname VARCHAR(255) NOT NULL,
	pet_type VARCHAR(255) NOT NULL,
	breed VARCHAR(255) NOT NULL,
	gender VARCHAR(255) NOT NULL,
	birthday DATE NOT NULL,
	diagnosis VARCHAR(255) NOT NULL,
	weight VARCHAR(255) NOT NULL,
	customer_id BIGINT NOT NULL,
	CONSTRAINT fk_customer_pet FOREIGN KEY (customer_id) REFERENCES customer (id)
);

INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Марат','Кочетов','7(362)396-14-12','Marand','L0cutusque');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Анисья','Панова','7(3144)801-69-68','Annellye','Neck98Iron');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Ольга','Степанова','7(971)622-28-37','Orenarya','Sh0otGauze');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Алексей','Григорьев','7(839)298-43-39','Antanake','0UsedMedia');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Ксения','Виноградова','7(40)376-77-49','Kstophen','Neper0Basi');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Марк','Артемьев','7(02)209-04-73','Marvison','InlayB0red');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Иван','Носов','7(263)064-08-81','Ifan','KitV0lumen');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Марьяна','Кондратьева','7(1939)789-80-51','Moreya','05SmallPan');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Леся','Соколова','7(52)260-52-36','Lesleyna','3SteepPtah');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Аниса','Фролова','7(013)056-14-00','Acianaev','Priority71');
INSERT INTO doctor(first_name, surname, phone, login, password) VALUES('Милана','Осипова','7(89)605-82-00','Mindlay','Navem60Lia');

INSERT INTO customer(first_name, surname, phone, email) VALUES('Василиса','Савельева','7(093)772-95-28','wovcigcw76@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Марьяна','Крылова','7(970)174-43-51','jwddhyfs91@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Марфа','Зимина','7(5801)671-50-73','sondqyuw87@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Эдуард','Тихонов','7(0232)828-92-97','iodjypsh73@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Родион','Колесников','7(4035)939-04-57','zkmqxtbf75@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Игнатий','Орлов','7(084)646-96-78','nwxovebd4@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Алеся','Борисова','7(5725)995-34-42','irccczzq42@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Данила','Дмитриев','7(3229)807-24-47','zwayaxpm62@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Влада','Левина','7(33)233-05-84','jiumxdhc69@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Кира','Ушакова','7(708)409-82-17','tnjqqmgw50@mail.ru');
INSERT INTO customer(first_name, surname, phone, email) VALUES('Зина','Артемьева','7(159)181-63-37','ysfjmdpk55@mail.ru');

INSERT INTO service(title) VALUES('Консультация');
INSERT INTO service(title) VALUES('Осмотр');
INSERT INTO service(title) VALUES('Лечение');

INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-23','Отклонена', 10, 1, 1);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-21','Отклонена', 5, 2, 4);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-20', DEFAULT, 1, 3, 5);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-07', DEFAULT, 2, 1, 7);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-02','Отклонена', 5, 2, 8);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-28', DEFAULT, 9, 3, 2);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-27','Завершена', 3, 2, 6);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-05','Завершена', 7, 3, 9);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-22', DEFAULT, 1, 2, 11);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-30','Завершена', 7, 2, 10);
INSERT INTO appointment(date_appt, status, doctor_id, service_id, customer_id) VALUES('2026-04-17', DEFAULT, 7, 3, 3);

INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Шуршик','Ящерица','Эублефар','Мужской','2021-10-03','Здоров','0,08', 1);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Рокки','Попугай','Волнистый','Мужской','2020-03-08','Аитаминоз','0,04', 11);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Пряник','Хомяк','Джунгарский','Мужской','2021-03-17','Здоров','0,065', 6);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Миса','Собака','Пекинес','Женский','2021-02-06','Пателла','5,5', 3);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Оскар','Собака','Шпиц','Мужской','2020-10-03','Здоров','2,1', 4);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Сахарок','Кролик','Гермелин','Женский','2021-09-19','Малокклюзия','2,3', 8);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Чернышка','Кошка','Персидская','Женский','2021-11-01','Пиометра','4,0', 2);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Плюша','Хомяк','Сирийский','Женский','2021-08-04','Здоров','0,2', 7);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Лайма','Попугай','Корелла','Женский','2021-06-29','Здоров','0,12', 5);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Кнопа','Кошка','Манчкин','Женский','2020-08-31','Здоров','3,5', 10);
INSERT INTO pet(nickname, pet_type, breed, gender, birthday, diagnosis, weight, customer_id) VALUES('Белла','Собака','Сенбернар','Женский','2021-07-09','Здоров','56,5', 9);

COMMIT;