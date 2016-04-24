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
       try{ 
           army.alistarElfo(e1);
        }catch (NaoPodeAlistarException npae){
            System.out.println(npae);
        }
       assertEquals(false, army.getExercitoDeElfos().contains(e1));
    }
    
    @Test
    public void invitarElfoVerdeENoturno ()  throws NaoPodeAlistarException{
       ExercitoDeElfos army = new ExercitoDeElfos();
       Elfo e1 = new ElfoVerde("haldir");
       Elfo e2 = new ElfoNoturno("legolas");
        
       army.alistarElfo(e1);
       army.alistarElfo(e2);
       assertEquals(true, army.getExercitoDeElfos().contains(e1));
       assertEquals(true, army.getExercitoDeElfos().contains(e2));
    }
    
    @Test
    public void invitarElfoNormalComElfoNoturno()  throws NaoPodeAlistarException{
       ExercitoDeElfos army = new ExercitoDeElfos();
       Elfo e1 = new Elfo("haldir");
       Elfo e2 = new ElfoNoturno("legolas");
        
       army.alistarElfo(e1);
       army.alistarElfo(e2);
       assertEquals(false, army.getExercitoDeElfos().contains(e1));
       assertEquals(true, army.getExercitoDeElfos().contains(e2));
    } 
    
    @Test
    public void buscarElfoPorNome()  throws NaoPodeAlistarException{
        // busca elfo por nome e retorna objeto elfo.
        ExercitoDeElfos army = new ExercitoDeElfos();
        Elfo e1 = new ElfoNoturno("Elrond");
        
        army.alistarElfo(e1);
        
        assertEquals(e1,army.buscarPorNome("Elrond"));
    }
    
    @Test
    public void buscarElfoVivo()  throws NaoPodeAlistarException{
        Elfo elf1 = new ElfoNoturno("anastacia");
        Elfo elf2 = new ElfoVerde("robin hood");
        do{
            elf1.atirarFlecha(new Dwarf("alvo"));
        }while(elf1.getStatus() == Status.VIVO);
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.alistarElfo(elf1);
        army.alistarElfo(elf2);   
        
        army.agruparPorStatus();
        ArrayList<Elfo> vivo = army.buscarPorStatus(Status.VIVO);

        assertTrue(vivo.contains(elf2));   
    }
    
    @Test
    public void exercitoAgrupadoCom2MortosENenhumVivo()  throws NaoPodeAlistarException{
        Elfo elf1 = new ElfoNoturno("anastacia");
        Elfo elf2 = new ElfoNoturno("robin hood");
        do{
            elf1.atirarFlecha(new Dwarf("alvo"));
            elf2.atirarFlecha(new Dwarf("alvojr"));
        }while(elf1.getStatus() == Status.VIVO);
        ExercitoDeElfos army = new ExercitoDeElfos();
        army.alistarElfo(elf1);
        army.alistarElfo(elf2);        
       
        army.agruparPorStatus();
        ArrayList<Elfo> morto = army.buscarPorStatus(Status.MORTO);
        assertTrue(morto.contains(elf1) && morto.contains(elf2));
    }
    
    @Test
    public void exercitoAgrupadoCom2VivosENenhumMorto()  throws NaoPodeAlistarException{
        Elfo elf1 = new ElfoNoturno("anastacia");
        Elfo elf2 = new ElfoVerde("robin hood");

        ExercitoDeElfos army = new ExercitoDeElfos();
        army.alistarElfo(elf1);
        army.alistarElfo(elf2);        
       
        army.agruparPorStatus();
        ArrayList<Elfo> vivo = army.buscarPorStatus(Status.VIVO);
        assertTrue(vivo.contains(elf1) && vivo.contains(elf2));
    }
    
    @Test
    public void exercitoAgrupadoSemElfos(){
        ExercitoDeElfos army = new ExercitoDeElfos();        
       
        army.agruparPorStatus();
        
        assertNull(army.buscarPorStatus(Status.VIVO));
        assertNull(army.buscarPorStatus(Status.MORTO));
    }
    
    @Test
    public void invitar1ElfoVerdeE1NoturnoComMesmoNome()  throws NaoPodeAlistarException{
        ExercitoDeElfos army = new ExercitoDeElfos();
        Elfo elf1 = new ElfoVerde("NomeIgual");
        Elfo elf2 = new ElfoNoturno("NomeIgual");
        
        do{
            elf2.atirarFlecha(new Dwarf("oi"));
        }while(elf2.getStatus() == Status.VIVO);
        
        army.alistarElfo(elf2);
        army.alistarElfo(elf1);
        
      army.agruparPorStatus();
      ArrayList<Elfo> deuRuim = army.buscarPorStatus(Status.MORTO);
      //Elfo noturno está morto, deveria constar no array deuRuim. Mas foi sub pelo verde
      assertNull(deuRuim);
    }
}
