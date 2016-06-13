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
@Table(name= "PEDIDO")
public class Pedido implements Serializable {
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PEDIDO")
    @SequenceGenerator(name = "SEQ_PEDIDO",  sequenceName = "SEQ_PEDIDO", allocationSize = 1)
    
    @Basic(optional = false)
    @Column(name = "ID_PEDIDO")
    private Long idPedido;
    
    @OneToOne
    @JoinColumn(name="IDCLIENTE")
    private Cliente cliente;
    
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    public List<PedidoItem> itens;
    
    @Temporal(TemporalType.DATE)
    @Basic(optional = false)
    @Column(name = "DATAPEDIDO")
    private Date dataPedido;
    
    @Temporal(TemporalType.DATE)
    @Basic(optional = false)
    @Column(name = "DATAENTREGA")
    private Date dataEntrega;
    
    @Basic(optional = false)
    @Column(name = "VALORPEDIDO")
    private double valorPedido;
    
    @Basic(optional = false)
    @Column(name = "SITUACAO")
    private char situacao;

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
}
