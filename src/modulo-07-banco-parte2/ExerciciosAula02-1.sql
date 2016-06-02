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

DECLARE
vNomeCliente Cliente.Nome%Type;
vNomeCidade Cidade.Nome%Type;
vPrimeiraCompra pedido.datapedido%type;
vUltimaCompra pedido.datapedido%type;
vValor pedido.valorpedido%type;
Begin

select cli.nome, cid.nome, Min(ped.datapedido), Max(ped.Datapedido), sum(ped.valor)
into vNomeCliente, vNomeCidade
from cliente cli
  left join cidade cid on cid.IDcidade = cli.idcidade
  left join pedido ped on ped.idcliente = cli.idcliente
  where cli.idcliente = &pidcliente
  group by cli.nome, cid.nome;
  
END;

-- PROCEDURE

CREATE PROCEDURE recebeId(IDpedido in integer) as
BEGIN

  update PEDIDO
    set pedido.ValorPedido = pedidoitem.quantidade * produto.precovenda
  where IDPEDIDO = IDpedido;        
        
END;