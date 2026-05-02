BEGIN;

INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('MARAT','KOCHETOV','7(362)396-14-12','Marand','L0cutusque');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('ANISYA','PANOVA','7(3144)801-69-68','Annellye','Neck98Iron');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('OLGA','STEPANOVA','7(971)622-28-37','Orenarya','Sh0otGauze');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('ALEKSEY','GRIGORYEV','7(839)298-43-39','Antanake','0UsedMedia');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('KSENIYA','VINOGRADOVA','7(40)376-77-49','Kstophen','Neper0Basi');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('MARK','ARTEMYEV','7(02)209-04-73','Marvison','InlayB0red');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('IVAN','NOSOV','7(263)064-08-81','Ifan','KitV0lumen');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('MARYANA','KONDRATYEVA','7(1939)789-80-51','Moreya','05SmallPan');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('LESYA','SOKOLOVA','7(52)260-52-36','Lesleyna','3SteepPtah');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('ANISA','FROLOVA','7(013)056-14-00','Acianaev','Priority71');
INSERT INTO clinic.doctor(first_name, surname, phone, login, password) VALUES('MILANA','OSIPOVA','7(89)605-82-00','Mindlay','Navem60Lia');

INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('VASILISA','SAVELYEVA','7(093)772-95-28','wovcigcw76@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('MARYANA','KRYLOVA','7(970)174-43-51','jwddhyfs91@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('MARFA','ZIMINA','7(5801)671-50-73','sondqyuw87@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('EDUARD','TIKHONOV','7(0232)828-92-97','iodjypsh73@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('RODION','KOLESNIKOV','7(4035)939-04-57','zkmqxtbf75@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('IGNATIY','ORLOV','7(084)646-96-78','nwxovebd4@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('ALESYA','BORISOVA','7(5725)995-34-42','irccczzq42@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('DANILA','DMITRIEV','7(3229)807-24-47','zwayaxpm62@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('VALADA','LEVINA','7(33)233-05-84','jiumxdhc69@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('KIRA','USHAKOVA','7(708)409-82-17','tnjqqmgw50@mail.ru');
INSERT INTO clinic.customer(first_name, surname, phone, email) VALUES('ZINA','ARTEMYEVA','7(159)181-63-37','ysfjmdpk55@mail.ru');

INSERT INTO clinic.service(title, price) VALUES('CONSULTATION', 300.00);
INSERT INTO clinic.service(title, price) VALUES('EXAMINATION', 1500.00);
INSERT INTO clinic.service(title, price) VALUES('TREATMENT', 1000.00);

INSERT INTO clinic.pet_type(title) VALUES('CAT');
INSERT INTO clinic.pet_type(title) VALUES('DOG');
INSERT INTO clinic.pet_type(title) VALUES('PARROT');
INSERT INTO clinic.pet_type(title) VALUES('LIZARD');
INSERT INTO clinic.pet_type(title) VALUES('HAMSTER');
INSERT INTO clinic.pet_type(title) VALUES('RABBIT');

INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-23','DECLINED', 10, 1, 1);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-21','DECLINED', 5, 2, 4);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-20', DEFAULT, 1, 3, 5);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-07', DEFAULT, 2, 1, 7);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-02','DECLINED', 5, 2, 8);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-28', DEFAULT, 9, 3, 2);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-27','COMPLETED', 3, 2, 6);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-05','COMPLETED', 7, 3, 9);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-22', DEFAULT, 1, 2, 11);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-30','COMPLETED', 7, 2, 10);
INSERT INTO clinic.appointment(date, status, doctor_id, service_id, customer_id) VALUES('2026-04-17', DEFAULT, 7, 3, 3);

INSERT INTO clinic.breed(title, type_id) VALUES('EUBLEPHARIS', 4);
INSERT INTO clinic.breed(title, type_id) VALUES('BUDGERIGAR', 3);
INSERT INTO clinic.breed(title, type_id) VALUES('DJUNGARIAN', 5);
INSERT INTO clinic.breed(title, type_id) VALUES('PEKINGESE', 2);
INSERT INTO clinic.breed(title, type_id) VALUES('POMERANIAN', 2);
INSERT INTO clinic.breed(title, type_id) VALUES('HERMELIN', 6);
INSERT INTO clinic.breed(title, type_id) VALUES('PERSIAN', 1);
INSERT INTO clinic.breed(title, type_id) VALUES('GOLDEN', 5);
INSERT INTO clinic.breed(title, type_id) VALUES('COCKATIEL', 3);
INSERT INTO clinic.breed(title, type_id) VALUES('MUNCHKIN', 1);
INSERT INTO clinic.breed(title, type_id) VALUES('ST.BERNARD', 2);

INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('SHURSHIK','MALE','2021-10-03','HEALTHY',0.08, 4, 1, 1);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('ROCKY','MALE','2020-03-08','AVITAMINOSIS',0.04, 3, 2, 11);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('PRYANIK','MALE','2021-03-17','HEALTHY',0.06, 5, 3, 6);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('MISA','FEMALE','2021-02-06','PATELLA',5.50, 2, 4, 3);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('OSCAR','MALE','2020-10-03','HEALTHY',2.10, 2, 5, 4);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('SAKHOROK','FEMALE','2021-09-19','MALOCCLUSION',2.30, 6, 6, 8);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('CHERNYSHKA','FEMALE','2021-11-01','PYOMETRA',4.00, 1, 7, 2);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('PLYUSHA','FEMALE','2021-08-04','HEALTHY',0.20, 5, 8, 7);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('LAYMA','FEMALE','2021-06-29','HEALTHY',0.12, 3, 9, 5);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('KNOPA','FEMALE','2020-08-31','HEALTHY',3.50, 1, 10, 10);
INSERT INTO clinic.pet(nickname, gender, birthday, diagnosis, weight, type_id, breed_id, customer_id) VALUES('BELLA','FEMALE','2021-07-09','HEALTHY',56.50, 2, 11, 9);

COMMIT;