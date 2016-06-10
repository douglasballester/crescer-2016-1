package br.com.crescer.aula4.Exercicio04;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "Amigo")
public class Amigo implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_AMIGO")
    @SequenceGenerator(name = "SEQ_AMIGO",  sequenceName = "SEQ_AMIGO", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_AMIGO")
    private Long idAmigo;

    @Basic(optional = false)
    @Column(name = "DATA_AMIZADE")
    private Date dataAmizade;

    public Long getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(Long idAmigo) {
        this.idAmigo = idAmigo;
    }

    public Date getDataAmizade() {
        return dataAmizade;
    }

    public void setDataAmizade(Date dataAmizade) {
        this.dataAmizade = dataAmizade;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_USUARIO_AMIGO")
    private Usuario usuarioAmigo;

    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
     
}
