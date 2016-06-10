package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.Amigo;
import br.com.crescer.aula4.Exercicio04.Publicacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-10T17:31:44")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Publicacao> publicacoes;
    public static volatile SingularAttribute<Usuario, Long> idUsuario;
    public static volatile ListAttribute<Usuario, Amigo> amigos;
    public static volatile SingularAttribute<Usuario, String> nmUsuario;

}