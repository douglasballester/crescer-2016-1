import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class EstrategiaDoisTest{
    @Test
    public void ataqueNoVazio() throws NaoPodeAlistarException{
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfo1 = new ElfoVerde("G1");
        Elfo elfo2 = new ElfoVerde("G2");
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo2);
        
        ArrayList<Dwarf> dwarves = new ArrayList<>();
        exercito.atacar(dwarves);        
        List<Elfo> ordemAtaque = exercito.ordemDeAtaque();
        
        
        
        assertEquals(0, ordemAtaque.size());
    }
    
    @Test
    public void ataqueSoComVerdes() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfo1 = new ElfoVerde("G1");
        Elfo elfo2 = new ElfoVerde("G2");
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo2);
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"))));
        
        List<Elfo> ordemAtaque = exercito.ordemDeAtaque();
        
        assertEquals(elfo1, ordemAtaque.get(0));
        assertEquals(elfo2, ordemAtaque.get(1));
        
        assertEquals(2, ordemAtaque.size());
    }
    
      @Test
    public void ataqueSoComNoturnos() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfo1 = new ElfoNoturno("N1");
        Elfo elfo2 = new ElfoNoturno("N2");
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo2);
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"))));
        
        List<Elfo> ordemAtaque = exercito.ordemDeAtaque();
        
        assertEquals(elfo1, ordemAtaque.get(0));
        assertEquals(elfo2, ordemAtaque.get(1));
        
        assertEquals(2, ordemAtaque.size());
    }
    
    @Test
    public void ataqueComVerdesEUmNoturno() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfo1 = new ElfoVerde("G1");
        Elfo elfo2 = new ElfoVerde("G2");
        Elfo elfo3 = new ElfoNoturno("N1");
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo2);
        exercito.alistarElfo(elfo3);
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"))));
        
        List<Elfo> ordemAtaque = exercito.ordemDeAtaque();
        
        assertEquals(elfo1, ordemAtaque.get(0));
        assertEquals(elfo2, ordemAtaque.get(1));
        assertEquals(elfo3, ordemAtaque.get(2));
        assertEquals(3, ordemAtaque.size());
    }
    
     @Test
    public void ataqueComVerdesEUmNoturnoCriandoEAlistantoNoturnoPorSegundo() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfo1 = new ElfoVerde("G1");
        Elfo elfo3 = new ElfoNoturno("N1");
        Elfo elfo2 = new ElfoVerde("G2");
       
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo3);
        exercito.alistarElfo(elfo2);
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"))));
        
        List<Elfo> ordemAtaque = exercito.ordemDeAtaque();
        
        assertEquals(elfo1, ordemAtaque.get(0));
        assertEquals(elfo2, ordemAtaque.get(1));
        assertEquals(elfo3, ordemAtaque.get(2));
        assertEquals(3, ordemAtaque.size());
    }
    
     @Test
    public void ataqueComVerdesEUmNoturnoCridoEAlistadoPrimeiro() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfo3 = new ElfoNoturno("N1");
        Elfo elfo1 = new ElfoVerde("G1");
        Elfo elfo2 = new ElfoVerde("G2");
        
        exercito.alistarElfo(elfo3);
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo2);
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"),new Dwarf("D2"))));
        
        List<Elfo> ordemAtaque = exercito.ordemDeAtaque();
        
        assertEquals(elfo1, ordemAtaque.get(0));
        assertEquals(elfo2, ordemAtaque.get(1));
        assertEquals(elfo3, ordemAtaque.get(2));
        assertEquals(3, ordemAtaque.size());
    }
    
     @Test
    public void ataqueComVerdesENoturnosComArrayMisturado() throws NaoPodeAlistarException {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfo3 = new ElfoNoturno("N1");
        Elfo elfo1 = new ElfoVerde("G1");
        Elfo elfo4 = new ElfoNoturno("N2");
        Elfo elfo5 = new ElfoNoturno("N3");
        Elfo elfo2 = new ElfoVerde("G2");
        
        exercito.alistarElfo(elfo3);
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo4);
        exercito.alistarElfo(elfo5);
        exercito.alistarElfo(elfo2);
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"))));
        
        List<Elfo> ordemAtaque = exercito.ordemDeAtaque();
        
        assertEquals(elfo1, ordemAtaque.get(0));
        assertEquals(elfo2, ordemAtaque.get(1));
        assertEquals(elfo3, ordemAtaque.get(2));
        assertEquals(elfo4, ordemAtaque.get(3));
        assertEquals(elfo5, ordemAtaque.get(4));
        assertEquals(5, ordemAtaque.size());
    } 
}
   
