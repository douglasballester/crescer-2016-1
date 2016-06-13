package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.PedidoItem;
import br.com.crescer.aula4.Exercicio04.ProdutoMaterial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T01:49:52")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Double> precoVenda;
    public static volatile SingularAttribute<Produto, Long> idProduto;
    public static volatile SingularAttribute<Produto, Double> precoCusto;
    public static volatile ListAttribute<Produto, ProdutoMaterial> materiais;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile ListAttribute<Produto, PedidoItem> pedidos;
    public static volatile SingularAttribute<Produto, Date> dataCadastro;
    public static volatile SingularAttribute<Produto, Character> situcacao;

}