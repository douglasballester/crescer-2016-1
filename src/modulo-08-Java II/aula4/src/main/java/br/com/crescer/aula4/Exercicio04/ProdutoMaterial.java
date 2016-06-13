package br.com.crescer.aula4.Exercicio04;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name= "PRODUTOMATERIAL")
public class ProdutoMaterial implements Serializable{
    
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PRODUTO_MATERIAL")
    @SequenceGenerator(name = "SEQ_PRODUTO_MATERIAL", sequenceName = "SEQ_PRODUTO_MATERIAL", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "IDPRODUTOMATERIAL")
    private long idProdutoMaterial;
    
    @OneToOne
    @JoinColumn(name="IDPRODUTO")
    private Produto produto;
    
    @OneToOne
    @JoinColumn(name="IDMATERIAL")
    private Material material;
    
    @Basic(optional = false)
    @Column(name = "QUANTIDADE")
    private long quantidade;

    public long getIdProdutoMaterial() {
        return idProdutoMaterial;
    }

    public void setIdProdutoMaterial(long idProdutoMaterial) {
        this.idProdutoMaterial = idProdutoMaterial;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }
}
