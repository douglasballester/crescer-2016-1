package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-10T17:31:44")
@StaticMetamodel(Publicacao.class)
public class Publicacao_ { 

    public static volatile SingularAttribute<Publicacao, String> conteudo;
    public static volatile SingularAttribute<Publicacao, Date> dataPublicacao;
    public static volatile SingularAttribute<Publicacao, Long> idPublicacao;
    public static volatile SingularAttribute<Publicacao, Usuario> usuario;

}