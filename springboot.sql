CREATE DATABASE springboot;
USE springboot;
CREATE TABLE tbl_employee
(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(255),
gender VARCHAR(255),
department VARCHAR(255),
dob DATE
)
