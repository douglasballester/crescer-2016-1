package br.com.crescer.aula4.Exercicio04;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name= "Usuario")
public class Usuario implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_USUARIO")
    @SequenceGenerator(name = "SEQ_USUARIO",  sequenceName = "SEQ_USUARIO", allocationSize = 1)
    
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Basic(optional = false)
    @Column(name = "NOME_USUARIO")
    private String nmUsuario;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Amigo> amigos) {
        this.amigos = amigos;
    }
    
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }
    
    @OneToMany(mappedBy="usuario")
    private List<Amigo> amigos;
}
