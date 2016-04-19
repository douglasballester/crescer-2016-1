BEGIN TRANSACTION
GO
UPDATE associado
set DataNascimento = convert (datetime, '19/03/1942', 103)
where IDAssociado = 4; 


INSERT INTO Associado 
(IDAssociado, Nome, DataNascimento, CPF, sexo) 
VALUES 
(3, 'Julio de Castilhos',convert(datetime, '14/12/1947', 103, 21234567895, 'M')


INSERT INTO Associado 
(IDAssociado, Nome, CPF, sexo,  DataNascimento) 
VALUES 
(4, 'Antonio Augusto Borges de Medeiros', 81234567891, 'M', convert(datetime, '19/03/1942',103))


INSERT INTO Associado
 (IDAssociado, Nome,  CPF, sexo ,DataNascimento) 
VALUES 
(5, 'Osvaldo Aranha', 01234567893, 'M',convert(datetime, '08/02/1958', 103))


select *
into CidadeAux
from Cidade;

insert into CidadeAux select * from Cidade

-------------------------------------------------------------------------
 alter table produto drop column IDPRODUTO

 alter table produto add constraint PK_produto
 primary key
 (CodigoIdentificacao)

 drop table produto

 Create table Produto(
 CodigoIdentificacao int identity not null,
 NomeCurto varchar(30) not null,
 NomeDescritivo varchar(30) not null,
 DataCriacao date not null,
 LocalEstoque varchar(30) not null,
 Quantidade int not null,
 Preco float not null,

 constraint PK_Produto primary key (CodigoIdentificacao)
 );

 INSERT INTO Produto
 (NomeCurto,NomeDescritivo,DataCriacao,LocalEstoque,Quantidade,Preco)
 Values
 ('Arroz','Grao de arroz', convert(datetime,'10/10/2000',103),'moinho',5,10)

  INSERT INTO Produto
 (NomeCurto,NomeDescritivo,DataCriacao,LocalEstoque,Quantidade,Preco)
 Values
 ('Feijao','Grao de Feijao', convert(datetime,'11/01/2000',103),'horta',1,23)

 select * from produto