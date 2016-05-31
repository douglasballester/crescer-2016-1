Exercicio 01
select cli.IDCLIENTE Id, cli.NOME NomeCliente, cid.NOME NomeCidade, cid.UF  FROM CLIENTE cli
inner join CIDADE cid
on cli.IDCIDADE = cid.IDCIDADE
order by cli.IDCLIENTE;

Exercicio 02
select COUNT(*) from PEDIDO p
where Extract(month from p.DATAPEDIDO) = 5
AND EXTRACT (YEAR FROM p.DATAPEDIDO) = 2016;

Exercicio 03
select c.RAZAOSOCIAL from Cliente c
where c.RAZAOSOCIAL like '%ltda_';

Exercicio 04
Select max (IDPRODUTO) from PRODUTO;
create sequence SQPRODUTO START WITH 8001;
INSERT INTO PRODUTO(IDPRODUTO, NOME, PRECOCUSTO, PRECOVENDA, SITUACAO) VALUES (SQPRODUTO.nextval,'Galocha Maragato', 35.67, 77.95, 'A');

SELECT * FROM PRODUTO WHERE IDPRODUTO = 8001;

commit;
