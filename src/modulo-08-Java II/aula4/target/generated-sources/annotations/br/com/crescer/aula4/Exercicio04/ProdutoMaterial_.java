package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.Material;
import br.com.crescer.aula4.Exercicio04.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T01:49:52")
@StaticMetamodel(ProdutoMaterial.class)
public class ProdutoMaterial_ { 

    public static volatile SingularAttribute<ProdutoMaterial, Long> idProdutoMaterial;
    public static volatile SingularAttribute<ProdutoMaterial, Produto> produto;
    public static volatile SingularAttribute<ProdutoMaterial, Material> material;
    public static volatile SingularAttribute<ProdutoMaterial, Long> quantidade;

}