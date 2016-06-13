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
@Table(name= "CIDADE")
public class Cidade implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_CIDADE")
    @SequenceGenerator(name = "SEQ_CIDADE",  sequenceName = "SEQ_CIDADE", allocationSize = 1)
    
    @Basic(optional = false)
    @Column(name = "ID_CIDADE")
    private Long idCidade;
    
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    
    @Basic(optional = false)
    @Column(name = "UF")
    private String uf;

    
    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    } 
}
