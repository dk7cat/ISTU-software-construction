--
-- File generated with SQLiteStudio v3.3.3 on Fri Jan 28 21:36:31 2022
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: audience
CREATE TABLE audience (id BIGINT PRIMARY KEY UNIQUE NOT NULL, name VARCHAR (20) UNIQUE NOT NULL);
INSERT INTO audience (id, name) VALUES (1, 'A-321');
INSERT INTO audience (id, name) VALUES (2, 'A-543');
INSERT INTO audience (id, name) VALUES (3, 'A-232');
INSERT INTO audience (id, name) VALUES (4, 'B-222');
INSERT INTO audience (id, name) VALUES (5, 'B-654');

-- Table: day
CREATE TABLE day (id BIGINT PRIMARY KEY UNIQUE NOT NULL, name VARCHAR UNIQUE NOT NULL);
INSERT INTO day (id, name) VALUES (1, 'Monday');
INSERT INTO day (id, name) VALUES (2, 'Tuesday');
INSERT INTO day (id, name) VALUES (3, 'Wednesday');
INSERT INTO day (id, name) VALUES (4, 'Thursday');
INSERT INTO day (id, name) VALUES (5, 'Friday');
INSERT INTO day (id, name) VALUES (6, 'Saturday');
INSERT INTO day (id, name) VALUES (7, 'Sunday');

-- Table: schedule
CREATE TABLE schedule (id BIGINT PRIMARY KEY UNIQUE NOT NULL, id_teacher BIGINT REFERENCES teacher (id) NOT NULL, id_subject BIGINT REFERENCES subject (id) NOT NULL, id_audience BIGINT REFERENCES audience (id) NOT NULL, id_day BIGINT REFERENCES day (id) NOT NULL, students_quantity BIGINT NOT NULL);
INSERT INTO schedule (id, id_teacher, id_subject, id_audience, id_day, students_quantity) VALUES (1, 1, 4, 1, 1, 20);
INSERT INTO schedule (id, id_teacher, id_subject, id_audience, id_day, students_quantity) VALUES (2, 3, 2, 3, 2, 30);
INSERT INTO schedule (id, id_teacher, id_subject, id_audience, id_day, students_quantity) VALUES (3, 2, 4, 2, 2, 30);
INSERT INTO schedule (id, id_teacher, id_subject, id_audience, id_day, students_quantity) VALUES (4, 5, 1, 5, 4, 50);
INSERT INTO schedule (id, id_teacher, id_subject, id_audience, id_day, students_quantity) VALUES (5, 4, 5, 4, 7, 50);

-- Table: subject
CREATE TABLE subject (id BIGINT PRIMARY KEY UNIQUE NOT NULL, name VARCHAR (50) UNIQUE NOT NULL);
INSERT INTO subject (id, name) VALUES (5, 'Geography');
INSERT INTO subject (id, name) VALUES (4, 'Biology');
INSERT INTO subject (id, name) VALUES (3, 'Informatics');
INSERT INTO subject (id, name) VALUES (2, 'Physics');
INSERT INTO subject (id, name) VALUES (1, 'Math');

-- Table: teacher
CREATE TABLE teacher (id BIGINT PRIMARY KEY UNIQUE NOT NULL, first_name VARCHAR (50) NOT NULL, last_name VARCHAR (50) NOT NULL, patronymic VARCHAR (50) NOT NULL);
INSERT INTO teacher (id, first_name, last_name, patronymic) VALUES (1, 'Anton', 'Jeltiy', 'Andreevich');
INSERT INTO teacher (id, first_name, last_name, patronymic) VALUES (2, 'Andrey', 'Zeleniy', 'Andreevich');
INSERT INTO teacher (id, first_name, last_name, patronymic) VALUES (3, 'Evgeniy', 'Orangeviy', 'Andreevich');
INSERT INTO teacher (id, first_name, last_name, patronymic) VALUES (4, 'Irina', 'Sinyaya', 'Andreevna');
INSERT INTO teacher (id, first_name, last_name, patronymic) VALUES (5, 'Elena', 'Belaya', 'Andreevna');
INSERT INTO teacher (id, first_name, last_name, patronymic) VALUES (6, 'Igor', 'Cherniy', 'Andreevich');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
