package br.com.crescer.aula4.Interfaces;

import java.util.List;

public interface IDAO<E> {
    
    void adicionar(E elem);
    
    void editar (E elem);
    
    void excluir (E elem);
    
    List<E> listAll();
}
