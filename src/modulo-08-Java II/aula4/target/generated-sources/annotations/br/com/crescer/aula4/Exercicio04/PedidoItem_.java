package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.Pedido;
import br.com.crescer.aula4.Exercicio04.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T01:49:52")
@StaticMetamodel(PedidoItem.class)
public class PedidoItem_ { 

    public static volatile SingularAttribute<PedidoItem, Double> precoUnitario;
    public static volatile SingularAttribute<PedidoItem, Character> situacao;
    public static volatile SingularAttribute<PedidoItem, Produto> produto;
    public static volatile SingularAttribute<PedidoItem, Pedido> pedido;
    public static volatile SingularAttribute<PedidoItem, Long> quantidade;
    public static volatile SingularAttribute<PedidoItem, Long> idPedidoItem;

}