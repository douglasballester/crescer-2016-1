import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EstrategiaTresTest{
    @Test
    public void atacarMeioMeio() throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        Elfo elfo1 = new ElfoVerde("e1");
        Elfo elfo2 = new ElfoVerde("e2");
        Elfo elfo3 = new ElfoNoturno("a1");
        Elfo elfo4 = new ElfoNoturno("a2");
       
        army.alistarElfo(elfo1);
        army.alistarElfo(elfo2);
        army.alistarElfo(elfo3);
        army.alistarElfo(elfo4);
        Dwarf dwarf1 = new Dwarf("gimbi");
        Dwarf dwarf2 = new Dwarf("gimli");
        ArrayList<Dwarf> dwarves = new ArrayList<>();
        dwarves.add(dwarf1);
        dwarves.add(dwarf2);
        
        EstrategiaGuerra estrategia = new EstrategiaTres();
        army.atacar(dwarves);
        List<Elfo> ordemAtaque = army.ordemDeAtaque();
        
       
        assertEquals(elfo3, ordemAtaque.get(0));
        assertEquals(elfo3, ordemAtaque.get(1));
        assertEquals(elfo1, ordemAtaque.get(2));  
        assertEquals(elfo1, ordemAtaque.get(3));  
    }
}
