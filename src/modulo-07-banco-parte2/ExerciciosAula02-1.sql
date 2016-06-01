-- Exercicio 01
DECLARE
vNome  VARCHAR2(60);
vCidade VARCHAR2(60);
BEGIN

  select cli.Nome,
  cid.NOME
  into vNome, vCidade
  from CLIENTE cli
  inner join CIDADE cid
  on cid.IDCIDADE = cli.IDCIDADE
  where  IDCLIENTE = &IDCliente;


  DBMS_OUTPUT.PUT_LINE('Nome: ' || vNome);
  DBMS_OUTPUT.PUT_LINE('Cidade: ' || vCidade);
END;
