CREATE DATABASE clientsDB;
GO

USE clientsDB;

CREATE TABLE clients(id int PRIMARY KEY IDENTITY(1,1),
first_name nvarchar(60),
last_name nvarchar(60),
birthday date,
gender char(1),
cellphone nvarchar(20),
home_phone nvarchar(25),
address_home nvarchar(60), 
profession nvarchar(50),
incomes int 
);
GO

insert into clients values ('Jonathan', 'Martinez', '2002/10/02','M','79176023','79176023','San Salvador','Developer',10000)

SELECT * FROM clients;