CREATE TABLE usuarios(
    id_usuario int primary key AUTO_INCREMENT,
    nome_usuario varchar(100) unique not null,
    email_usuario varchar(100) unique not null,
    senha_usuario varchar(200) not null
);