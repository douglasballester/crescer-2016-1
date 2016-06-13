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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "CLIENTE")
public class Cliente implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_CLIENTE")
    @SequenceGenerator(name = "SEQ_CLIENTE",  sequenceName = "SEQ_CLIENTE", allocationSize = 1)
    
    @Basic(optional = false)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;
    
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
   
    @Basic(optional = false)
    @Column(name = "RAZAOSOCIAL")
    private String razaoSocial;
    
    @Basic(optional = false)
    @Column(name = "ENDERECO")
    private String endereco;

    @Basic(optional = false)
    @Column(name = "BAIRRO")
    private String bairro;
    
    @OneToOne
    @JoinColumn(name="IDCIDADE")
    private Cidade cidade;
    
    @Basic(optional = false)
    @Column(name = "CEP")
    private String cep;
    
    @Basic(optional = false)
    @Column(name = "SITUACAO")
    private String situacao;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
