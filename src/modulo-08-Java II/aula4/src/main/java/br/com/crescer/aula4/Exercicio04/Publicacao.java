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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "Publicacao")
public class Publicacao implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PUBLICACAO")
    @SequenceGenerator(name = "SEQ_PUBLICACAO",  sequenceName = "SEQ_PUBLICACAO", allocationSize = 1)
   
    @Basic(optional = false)
    @Column(name = "ID_PUBLICACAO")
    private Long idPublicacao;

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_PUBLICACAO")
    private Date dataPublicacao;

    @Basic(optional = false)
    @Column(name = "CONTEUDO")
    private String conteudo;
    
    public Long getIdPublicacao() {
        return idPublicacao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setIdPublicacao(Long idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    } 

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;
    
}
