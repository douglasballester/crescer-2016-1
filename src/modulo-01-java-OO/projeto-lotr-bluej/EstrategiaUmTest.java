import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EstrategiaUmTest{
  
  @Test
  public void ataqueNoVazio() throws NaoPodeAlistarException{
      ExercitoDeElfos army = new ExercitoDeElfos();
      Elfo elfoNoturno1 = new ElfoNoturno("Elfo N1"); 
      Elfo elfoNoturno2 = new ElfoNoturno("Elfo N2");
      Elfo elfoNoturno3 = new ElfoNoturno("Elfo N3");
      Elfo elfoVerde1 = new ElfoVerde("Elfo V1");
      army.alistarElfo(elfoNoturno1);
      army.alistarElfo(elfoNoturno2);
      army.alistarElfo(elfoNoturno3);
      army.alistarElfo(elfoVerde1);
      
      ArrayList<Dwarf> dwarves = new ArrayList<>();
      army.atacar(dwarves);
      List<Elfo> ordemAtaque = army.ordemDeAtaque();
      
      assertEquals(0, ordemAtaque.size());
  }
    
  @Test
  public void ataqueCom3Noturnos1Verde() throws NaoPodeAlistarException {
      ExercitoDeElfos army = new ExercitoDeElfos();
      Elfo elfoNoturno1 = new ElfoNoturno("Elfo N1");
      Elfo elfoNoturno2 = new ElfoNoturno("Elfo N2");
      Elfo elfoNoturno3 = new ElfoNoturno("Elfo N3");
      Elfo elfoVerde1 = new ElfoVerde("Elfo V1");
      army.alistarElfo(elfoNoturno1);
      army.alistarElfo(elfoNoturno2);
      army.alistarElfo(elfoNoturno3);
      army.alistarElfo(elfoVerde1);
      
      ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao1"), new Dwarf("anao2"), new Dwarf("anao3")));
      army.atacar(dwarves);
      List<Elfo> ordemAtaque = army.ordemDeAtaque();
      
      assertEquals(elfoVerde1, ordemAtaque.get(0));
      assertEquals(elfoVerde1, ordemAtaque.get(1));
      assertEquals(elfoVerde1, ordemAtaque.get(2));
  
      assertEquals(elfoNoturno1, ordemAtaque.get(3));
      assertEquals(elfoNoturno1, ordemAtaque.get(4));
      assertEquals(elfoNoturno1, ordemAtaque.get(5));
      assertEquals(6, ordemAtaque.size());
    }
    
  @Test
  public void ataqueCom3NoturnosMortos() throws NaoPodeAlistarException {
      ExercitoDeElfos army = new ExercitoDeElfos();
      Elfo elfoNoturno1 = new ElfoNoturno("Elfo N1");
      Elfo elfoNoturno2 = new ElfoNoturno("Elfo N2");
      Elfo elfoNoturno3 = new ElfoNoturno("Elfo N3");
      army.alistarElfo(elfoNoturno1);
      army.alistarElfo(elfoNoturno2);
      army.alistarElfo(elfoNoturno3);
      Dwarf dwarf = new Dwarf("anao1");
      do{
          elfoNoturno1.atirarFlecha(dwarf);
          elfoNoturno2.atirarFlecha(dwarf);
          elfoNoturno3.atirarFlecha(dwarf);
        }while(elfoNoturno1.getStatus() == Status.VIVO);
      ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"),new Dwarf("anao3")));
      army.atacar(dwarves);
      
      List<Elfo> ordemAtaque = army.ordemDeAtaque();
      
      assertEquals(0,ordemAtaque.size());
}

 @Test
  public void ataqueSoComVerdes() throws NaoPodeAlistarException {
      ExercitoDeElfos army = new ExercitoDeElfos();
      Elfo elfo1 = new ElfoVerde("G1");
      Elfo elfo2 = new ElfoVerde("G2");
      Elfo elfo3 = new ElfoVerde("G3");
      army.alistarElfo(elfo1);
      army.alistarElfo(elfo2);
      army.alistarElfo(elfo3);
  
      ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"),new Dwarf("anao3")));
      army.atacar(dwarves);
      
      List<Elfo> ordemAtaque = army.ordemDeAtaque();
      
      assertEquals(ordemAtaque.get(0), elfo1);
      assertEquals(ordemAtaque.get(1), elfo1);
      assertEquals(ordemAtaque.get(2), elfo2);
      assertEquals(ordemAtaque.get(3), elfo2);
      assertEquals(ordemAtaque.get(4), elfo3);
      assertEquals(ordemAtaque.get(5), elfo3);
      
      assertEquals(6,ordemAtaque.size());
}

@Test
  public void ataqueSoComNoturnos() throws NaoPodeAlistarException {
      ExercitoDeElfos army = new ExercitoDeElfos();
      Elfo elfoNoturno1 = new ElfoNoturno("Elfo N1");
      Elfo elfoNoturno2 = new ElfoNoturno("Elfo N2");
      Elfo elfoNoturno3 = new ElfoNoturno("Elfo N3");
      army.alistarElfo(elfoNoturno1);
      army.alistarElfo(elfoNoturno2);
      army.alistarElfo(elfoNoturno3);
      
      ArrayList<Dwarf> dwarves = new ArrayList<>(Arrays.asList(new Dwarf("anao2"),new Dwarf("anao3"))); 
      army.atacar(dwarves);
      
      List<Elfo> ordemAtaque = army.ordemDeAtaque();
      
      //1,8
      assertEquals(1,ordemAtaque.size());
      assertEquals(ordemAtaque.get(0), elfoNoturno1);
}
}
