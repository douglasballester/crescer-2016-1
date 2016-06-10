package br.com.crescer.aula4.Run;

import br.com.crescer.aula4.Entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Run {
    
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRESCER16");
    static final EntityManager em = emf.createEntityManager();
    
    
    public static void main(String[] args) {
        
        Query query = em.createQuery("SELECT p FROM Pessoa p");
        List<Pessoa> pessoas = query.getResultList();
        
        
        
        em.close();
        emf.close();
    }
}
