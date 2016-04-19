import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class EstrategiaDoisTest{
   @Test
    public void ataqueComVerdesENoturnoMorto() throws NaoPodeAlistarException {
      
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo en1 = new ElfoNoturno("Night 1");
        Elfo en2 = new ElfoNoturno("Night 2");
        Elfo ev1 = new ElfoVerde("Green 1");
        Elfo en3 = new ElfoNoturno("Night 3");
        Elfo ev2 = new ElfoVerde("Green 2");
        for (int i = 0; i < 90; i++) en1.atirarFlecha(new Dwarf("D1"));
        exercito.alistarElfo(en1);
        exercito.alistarElfo(en2);
        exercito.alistarElfo(ev1);
        exercito.alistarElfo(en3);
        exercito.alistarElfo(ev2);
        ArrayList<Elfo> esperado = new ArrayList<>(Arrays.asList(ev2, ev1, en3, en2));
   
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"), new Dwarf("D2"), new Dwarf("D3"))));
 
        assertEquals(esperado, exercito.ordemDeAtaque());
    }
    
    @Test
    public void exercitoEmbaralhadoPriorizaAtaqueComElfosVerdes() throws NaoPodeAlistarException {
     
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.escolherEstrategia(new EstrategiaDois());
        Elfo elfoNot1 = new ElfoNoturno("eN1");
        Elfo elfoNot2 = new ElfoNoturno("eN2");
        Elfo elfoNot3 = new ElfoNoturno("eN3");
        Elfo elfVer1 = new ElfoVerde("V1");
        Elfo elfVer2 = new ElfoVerde("V2");
        exercito.alistarElfo(elfoNot1);
        exercito.alistarElfo(elfoNot2);
        exercito.alistarElfo(elfVer1);
        exercito.alistarElfo(elfoNot3);
        exercito.alistarElfo(elfVer2);
        ArrayList<Elfo> esperado = new ArrayList<>(Arrays.asList(elfVer1, elfVer2, elfoNot2, elfoNot1, elfoNot3));
    
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("anao1"), new Dwarf("anao2"), new Dwarf("anao3"))));
   
        assertEquals(esperado, exercito.ordemDeAtaque());
    }
}