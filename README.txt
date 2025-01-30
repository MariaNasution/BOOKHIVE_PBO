Pada kesempatan ini kita akan melakukan demo aplikasi MyBookSelf, ada beberapa hal yang harus diperhatikan yaitu Pastikan device kamu memiliki Aplikasi NetBeans (instalasi tersedia pada Praktikum 7) untuk IDE  dan jdbc( intalasi MariaDb dan SQLYog) yang tersedia pada praktikum 9 untuk database

Tahap Instalasi dan penggunaan aplikasi MyBookShelf
1. pertama, buka SQLYog lalu buka file 'app_k8.sql'
2. Kemudian eksekusi queri satu persatu.
dimulai dengan
	 CREATE DATABASE app_k8;
kemudian 
	USE app_k8;

lalu 	
	CREATE TABLE users ( 
	`isbn`INT (5) PRIMARY KEY,
	`title` VARCHAR (50) NOT NULL, 
	`pages` INT (10) NOT NULL, 
	`archives` VARCHAR(20) NOT NULL DEFAULT 0,
	`authors` VARCHAR (50) NOT NULL,
	`publhiser` VARCHAR (50) NOT NULL,
	`year` INT (50) NOT NULL,
	`current_pages`INT (50) NOT NULL,
	`created_at` DATETIME DEFAULT CURRENT_TIMESTAMP
	);

Patikan tabel  telah tersedia dengan mengeksekusi
	SELECT * FROM users

3. Silahkan ekstrak file app_k8_11s22039.zip di file explore
4. Silahkan buka NetBeans pada device anda, kemudian open project yang terdapat pada file yang telah di extraxt
5. Lalu Jalankan
