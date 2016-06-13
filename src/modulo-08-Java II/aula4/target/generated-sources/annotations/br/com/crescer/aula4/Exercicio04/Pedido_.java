package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.Cliente;
import br.com.crescer.aula4.Exercicio04.PedidoItem;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T01:49:52")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile ListAttribute<Pedido, PedidoItem> itens;
    public static volatile SingularAttribute<Pedido, Character> situacao;
    public static volatile SingularAttribute<Pedido, Date> dataEntrega;
    public static volatile SingularAttribute<Pedido, Date> dataPedido;
    public static volatile SingularAttribute<Pedido, Long> idPedido;
    public static volatile SingularAttribute<Pedido, Double> valorPedido;

}