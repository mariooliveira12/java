create database concessionaria;

use concessionaria;

create table usuario(
CPF varchar(20) not null,
nome varchar(60) not null,
email varchar(60) not null,
telefone varchar(20) not null,
RG varchar(20) not null,
endereco varchar(60) not null,
senha varchar(20) not null,
primary key(CPF));

select * from usuario;

create table veiculo(
chassi varchar(20) not null,
modelo varchar(20) not null,
fabricante varchar(30) not null,
cor varchar(20) not null, 
ano varchar(10) not null,
preco varchar(20) not null,
primary key(chassi));

select * from veiculo;