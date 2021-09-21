DROP TABLE IF EXISTS tb_alunos;



CREATE TABLE tb_alunos (

    id INT AUTO_INCREMENT  PRIMARY KEY,

    nome VARCHAR(250) NOT NULL,

    matricula VARCHAR(250) NOT NULL

);



INSERT INTO tb_alunos (nome, matricula) VALUES

('Rogerio', 'nonono'),

('Maria', 'nonono'),

('Ze', 'nonono');