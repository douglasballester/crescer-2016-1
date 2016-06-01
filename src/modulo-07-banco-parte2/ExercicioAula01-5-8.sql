-- Exercicio 05
select idproduto, nome from produto where not exists (select 1 from PEDIDOITEM where pedidoitem.idproduto = produto.idproduto);

--Exercicio 06
select ped.datapedido,
        prod.idproduto,
        prod.nome,
        item.quantidade,
        item.PrecoUnitario
 from pedidoitem item
    inner join pedido ped on ped.idpedido = item.idpedido
    inner join produto pro on pro.idproduto = item.idproduto
where ped.idcliente = :pidcliente;
        
        
-- Exercicio 07

select sum(nvl(quantidade,0))
from pedidoitem
  inner join pedido on pedido.IDPEDIDO = pedidoitem.idpedido
where idproduto = :pidproduto
and datapedido >= to_date('01/2016', 'mm/yyyy');

desc pedidoItem

-- Exercicio 08

select to_char(ped.datapedido, 'mm/yyyy') ANO_MES,
        COUNT(distinct item.idproduto) as produtos_distintos,
        sum(ped.valorpedido) as valor_pedidos,
        min(ped.valorpedido) as menor_pedido,
        max(ped.valorpedido) as maior_pedido,
        ROUND(AVG(ped.valorpedido),2) as Media_Pedidos,
        count(distinct ped.idpedido) as total_pedidos
from pedido ped
  inner join pedidoitem item on item.idpedido = ped.idpedido
group by to_char(ped.datapedido, 'mm/yyyy');