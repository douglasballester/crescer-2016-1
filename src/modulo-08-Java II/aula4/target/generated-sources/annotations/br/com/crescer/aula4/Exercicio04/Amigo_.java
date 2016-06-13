package br.com.crescer.aula4.Exercicio04;

import br.com.crescer.aula4.Exercicio04.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T01:49:52")
@StaticMetamodel(Amigo.class)
public class Amigo_ { 

    public static volatile SingularAttribute<Amigo, Long> idAmigo;
    public static volatile SingularAttribute<Amigo, Usuario> usuarioAmigo;
    public static volatile SingularAttribute<Amigo, Date> dataAmizade;
    public static volatile SingularAttribute<Amigo, Usuario> usuario;

}