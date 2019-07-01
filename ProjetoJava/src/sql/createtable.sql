CREATE TABLE pais(

   codigo SERIAL NOT NULL,
   sigla CHAR(3) NOT NULL,
   nome VARCHAR(30) NOT NULL,
   CONSTRAINT pk_pais PRIMARY KEY(codigo))