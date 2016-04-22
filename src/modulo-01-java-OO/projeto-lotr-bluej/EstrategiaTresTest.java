import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EstrategiaTresTest{
    @Test
    public void ataqueNoVazio() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfo1 = new ElfoVerde("ev1");
        Elfo elfo2 = new ElfoVerde("ev2");
        Elfo elfo3 = new ElfoNoturno("en1");
        Elfo elfo4 = new ElfoNoturno("en2");
       
        army.alistarElfo(elfo1);
        army.alistarElfo(elfo2);
        army.alistarElfo(elfo3);
        army.alistarElfo(elfo4);
        ArrayList<Dwarf> dwarves = new ArrayList<>(); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        assertEquals(0, ordemAtaque.size());
    }
    
    @Test
    public void atacarSohComVerdes() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfo1 = new ElfoVerde("ev1");
        Elfo elfo2 = new ElfoVerde("ev2");
        Elfo elfo3 = new ElfoVerde("ev3");
       
        army.alistarElfo(elfo1);
        army.alistarElfo(elfo2);
        army.alistarElfo(elfo3);
        ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"))); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
        assertEquals(0, ordemAtaque.size());  
    }
    
    @Test
    public void atacarSohComNoturnos() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfo1 = new ElfoNoturno("en1");
        Elfo elfo2 = new ElfoNoturno("en2");
        Elfo elfo3 = new ElfoNoturno("en3");
       
        army.alistarElfo(elfo1);
        army.alistarElfo(elfo2);
        army.alistarElfo(elfo3);
        ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"))); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
        assertEquals(0, ordemAtaque.size());  
    }
    
    @Test
    public void atacarComMaisVerdesQueNoturnos() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfo1 = new ElfoVerde("ev1");
        Elfo elfo2 = new ElfoVerde("ev2");
        Elfo elfo3 = new ElfoVerde("ev3");
        Elfo elfo4 = new ElfoNoturno("en1");
        army.alistarElfo(elfo1);
        army.alistarElfo(elfo2);
        army.alistarElfo(elfo3);
        army.alistarElfo(elfo4);
        ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"))); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
        assertEquals(0, ordemAtaque.size());  
    }
    
    @Test
    public void atacarComMaisNoturnosQueVerdes() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfo3 = new ElfoVerde("ev3");
        Elfo elfo4 = new ElfoNoturno("en1");
        Elfo elfo5 = new ElfoNoturno("en2");
        army.alistarElfo(elfo5);
        army.alistarElfo(elfo3);
        army.alistarElfo(elfo4);
        ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"))); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
        assertEquals(0, ordemAtaque.size());  
    }
    
    @Test //ESTE TESTE DA ERRADO PROPOSITALMENTE
    public void atacarComMaisNoturnosQueVerdesColocandoOmesmoNomeEm1VerdeE1Noturno() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfoChikungunya = new ElfoVerde("chikungunya");
        Elfo elfo4 = new ElfoNoturno("chikungunya");
        Elfo elfo5 = new ElfoNoturno("en2");
        
        army.alistarElfo(elfo4);
        army.alistarElfo(elfo5);
        army.alistarElfo(elfoChikungunya);
        ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"))); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
        assertEquals(2, ordemAtaque.size()); //Resultado deveria ser 0, mas como o elfo verde foi alistado depois do elfo noturno com o mesmo nome, ele o substituiu.
                                                //Com isso o exercito ficou 50%-50% e pode atacar...
    }
    
    @Test
    public void atacarMeioMeio() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfo1 = new ElfoVerde("ev1");
        Elfo elfo2 = new ElfoVerde("ev2");
        Elfo elfo3 = new ElfoNoturno("en1");
        Elfo elfo4 = new ElfoNoturno("en2");
        Elfo elfo5 = new ElfoNoturno("en3");
        Elfo elfo6 = new ElfoVerde("ev3");
        army.alistarElfo(elfo1);
        army.alistarElfo(elfo2);
        army.alistarElfo(elfo3);
        army.alistarElfo(elfo4);
        army.alistarElfo(elfo5);
        army.alistarElfo(elfo6);
        ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"))); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
        //Hash Map do Exercito ficou assim
        assertEquals(elfo2, ordemAtaque.get(0));
        assertEquals(elfo5, ordemAtaque.get(1));
        assertEquals(elfo1, ordemAtaque.get(2));  
        assertEquals(elfo3, ordemAtaque.get(3));
        assertEquals(elfo6, ordemAtaque.get(4));
        assertEquals(elfo4, ordemAtaque.get(5));
    }
    
     @Test
    public void atacarComMaisNoturnosQueVerdesMatandoOExcessoDeNoturnosEIgualandoExercito() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.escolherEstrategia(new EstrategiaTres());
        Elfo elfo3 = new ElfoVerde("ev3");
        Elfo elfo4 = new ElfoNoturno("en1");
        Elfo elfo5 = new ElfoNoturno("en2");
        army.alistarElfo(elfo5);
        army.alistarElfo(elfo3);
        army.alistarElfo(elfo4);
        Dwarf dwarf = new Dwarf("oi");
        do{
            elfo5.atirarFlecha(dwarf);
        }while(elfo5.getStatus() == Status.VIVO);
        
        ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"))); 
       
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
        assertEquals(2, ordemAtaque.size());
        assertEquals(elfo3, ordemAtaque.get(0));
        assertEquals(elfo4, ordemAtaque.get(1));
    }
    
}
