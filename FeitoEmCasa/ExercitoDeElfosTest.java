import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ExercitoDeElfosTest
{    
    @Test
    public void invitarElfoNormal(){
        ExercitoDeElfos army = new ExercitoDeElfos();
        Elfo e1 = new Elfo("haldir");
        
       army.alistarElfo(e1);
       
       assertEquals(false, army.getExercitoDeElfos().containsValue(e1));
    }
    
    @Test
    public void invitarElfoVerdeENoturno(){
       ExercitoDeElfos army = new ExercitoDeElfos();
       Elfo e1 = new ElfoVerde("haldir");
       Elfo e2 = new ElfoNoturno("legolas");
        
       army.alistarElfo(e1);
       army.alistarElfo(e2);
       assertEquals(true, army.getExercitoDeElfos().containsValue(e1));
       assertEquals(true, army.getExercitoDeElfos().containsValue(e2));
    }
    
    @Test
    public void invitarElfoNormalComElfoNoturno(){
       ExercitoDeElfos army = new ExercitoDeElfos();
       Elfo e1 = new Elfo("haldir");
       Elfo e2 = new ElfoNoturno("legolas");
        
       army.alistarElfo(e1);
       army.alistarElfo(e2);
       assertEquals(false, army.getExercitoDeElfos().containsValue(e1));
       assertEquals(true, army.getExercitoDeElfos().containsValue(e2));
    } 
    
    @Test
    public void buscarElfoPorNome(){
        // busca elfo por nome e retorna objeto elfo.
        ExercitoDeElfos army = new ExercitoDeElfos();
        Elfo e1 = new ElfoNoturno("Elrond");
        
        army.alistarElfo(e1);
        
        assertEquals(e1,army.buscarPorNome("Elrond"));
    }
    
    @Test
    public void exercitoAgrupadoCom1MortoE1Vivo(){
        Elfo elf1 = new ElfoNoturno("anastacia");
        Elfo elf2 = new ElfoVerde("robin hood");
        do{
            elf1.atirarFlecha(new Dwarf("alvo"));
        }while(elf1.getStatus() == Status.VIVO);
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.alistarElfo(elf1);
        army.alistarElfo(elf2);        
       
        army.agruparPorStatus();
        
        assertTrue(army.getExercitoAgrupado().containsKey(Status.VIVO) &&
                   army.getExercitoAgrupado().containsKey(Status.MORTO));
    }
    
    @Test
    public void exercitoAgrupadoCom2MortosENenhumVivo(){
        Elfo elf1 = new ElfoNoturno("anastacia");
        Elfo elf2 = new ElfoVerde("robin hood");
        do{
            elf1.atirarFlecha(new Dwarf("alvo"));
            elf2.atirarFlecha(new Dwarf("alvojr"));
        }while(elf1.getStatus() == Status.VIVO);
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.alistarElfo(elf1);
        army.alistarElfo(elf2);        
       
        army.agruparPorStatus();
        
        assertTrue(army.getExercitoAgrupado().containsKey(Status.MORTO));
    }
    
    @Test
    public void exercitoAgrupadoCom2VivosENenhumMorto(){
        Elfo elf1 = new ElfoNoturno("anastacia");
        Elfo elf2 = new ElfoVerde("robin hood");

        ExercitoDeElfos army = new ExercitoDeElfos();
        army.alistarElfo(elf1);
        army.alistarElfo(elf2);        
       
        army.agruparPorStatus();
        
        assertFalse(army.getExercitoAgrupado().containsKey(Status.MORTO));
    }
    
    @Test
    public void exercitoAgrupadoSemElfos(){
        ExercitoDeElfos army = new ExercitoDeElfos();        
       
        army.agruparPorStatus();
        
        assertTrue(army.getExercitoAgrupado().isEmpty());
    }
}
