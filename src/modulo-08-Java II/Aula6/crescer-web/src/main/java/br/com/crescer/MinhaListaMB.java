package br.com.crescer;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author DOUGLAS
 */
@ManagedBean(name = "minhalista")
@ViewScoped
public class MinhaListaMB {
    
    private List<Pessoa> lista = new ArrayList<Pessoa>();
    
    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }
  
}
