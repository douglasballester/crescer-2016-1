package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.Amigo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T01:49:52")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Long> idUsuario;
    public static volatile ListAttribute<Usuario, Amigo> amigos;
    public static volatile SingularAttribute<Usuario, String> nmUsuario;

}