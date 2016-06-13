package br.com.crescer.aula4.CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.sessions.Session;

public class Persistencia {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRESCER16");    

    public static final EntityManager em = emf.createEntityManager();    
    
    public static final Session session = em.unwrap(Session.class);
}
