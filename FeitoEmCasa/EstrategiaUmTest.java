import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EstrategiaUmTest{
    @Test
    public void exercitoAtacaDwarves()  throws NaoPodeAlistarException{
       ExercitoDeElfos exercito = criaExercitoDeElfos();
       ArrayList<Dwarf> dwarves = criaExercitoDeDwarves();
       EstrategiaUm estrategia = new EstrategiaUm();
       
       exercito.atacar(estrategia, dwarves);
       
      
    }
    
    private ArrayList<Dwarf> criaExercitoDeDwarves(){
        ArrayList<Dwarf> dwarves = new ArrayList<>();
        Dwarf dwarf1 = new Dwarf("Dwarf1");
        Dwarf dwarf2 = new IrishDwarf("Dwarf2");
        Dwarf dwarf3 = new Dwarf("Dwarf3");
     
        dwarves.add(dwarf1);
        dwarves.add(dwarf2);
        dwarves.add(dwarf3);
        return dwarves;
    }
    
    
    private ExercitoDeElfos criaExercitoDeElfos()  throws NaoPodeAlistarException{
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo elfo1 = new ElfoVerde("Elfo1");
        Elfo elfo2 = new ElfoNoturno("Elfo2");
        Elfo elfo3 = new ElfoNoturno("Elfo3");
        Elfo elfo4 = new ElfoNoturno("Elfo4");
        
        exercito.alistarElfo(elfo1);
        exercito.alistarElfo(elfo2);
        exercito.alistarElfo(elfo3);
        exercito.alistarElfo(elfo4);
        
        return exercito;
    }
}
