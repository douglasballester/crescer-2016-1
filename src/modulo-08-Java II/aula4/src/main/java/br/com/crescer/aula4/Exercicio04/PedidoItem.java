package br.com.crescer.aula4.Exercicio04;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "PEDIDOITEM")
public class PedidoItem implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PEDIDO_ITEM")
    @SequenceGenerator(name = "SEQ_PEDIDO_ITEM",  sequenceName = "SEQ_PEDIDO_ITEM", allocationSize = 1)
    
    @Basic(optional = false)
    @Column(name = "ID_PEDIDOITEM")
    private Long idPedidoItem;
    
    @OneToOne
    @JoinColumn(name="IDPEDIDO")
    private Pedido pedido;
    
    @OneToOne
    @JoinColumn(name="IDPRODUTO")
    private Produto produto;
   
    @Basic(optional = false)
    @Column(name = "QUANTIDADE")
    private long quantidade;
    
    @Basic(optional = false)
    @Column(name = "PRECOUNITARIO")
    private double precoUnitario;
    
    @Basic(optional = false)
    @Column(name = "SITUACAO")
    private char situacao;

    public Long getIdPedidoItem() {
        return idPedidoItem;
    }

    public void setIdPedidoItem(Long idPedidoItem) {
        this.idPedidoItem = idPedidoItem;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    
    
    
}
