CREATE DATABASE app_k8;
USE app_k8;

CREATE TABLE users ( 
	`isbn`INT (5) PRIMARY KEY,
	`title` VARCHAR (50) NOT NULL, 
	`pages` INT (10) NOT NULL, 
	`archives` TINYINT (1) NOT NULL DEFAULT 0,
	`authors` VARCHAR (50) NOT NULL,
	`publhiser` VARCHAR (50) NOT NULL,
	`year` INT (50) NOT NULL,
	`current_pages`INT (50) NOT NULL,
	`created_at` DATETIME DEFAULT CURRENT_TIMESTAMP
	);
	
	DROP DATABASE app_k8
	DROP TABLE users 
	
	ALTER TABLE users MODIFY archives VARCHAR(20);
	
	SELECT * FROM users