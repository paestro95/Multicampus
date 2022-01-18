show databases;
create database book;
use book;

CREATE TABLE book (
    bookNo CHAR(10),
    booktitle VARCHAR(30),
    bookauthor VARCHAR(20),
    bookyear INT,
    bookprice INT,
    bookpublisher CHAR(10),
    PRIMARY KEY (bookno)
);

show tables;
desc book;

insert into book values ('B001', '자바프로그래밍', '홍길동', 2021, 30000, '서울출판사');
insert into book values ('B002', '데이터베이스', '이몽룡', 2020, 25000, '멀티출판사');
insert into book values ('B003', 'HTML/CSS', '성춘향', 2021, 18000, '강남출판사');
SELECT 
    *
FROM
    book;