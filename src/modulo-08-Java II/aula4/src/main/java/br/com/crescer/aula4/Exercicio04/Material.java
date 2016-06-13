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
@Table(name= "MATERIAL")
public class Material implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_MATERIAL")
    @SequenceGenerator(name = "SEQ_MATERIAL",  sequenceName = "SEQ_MATERIAL", allocationSize = 1)
    
    @Basic(optional = false)
    @Column(name = "ID_MATERIAL")
    private Long idMaterial;
    
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    
    @Basic(optional = false)
    @Column(name = "PESOLIQUIDO")
    private double pesoLiquido;

    @Basic(optional = false)
    @Column(name = "PESOBRUTO")
    private double pesoBruto;

    public Long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }
}
