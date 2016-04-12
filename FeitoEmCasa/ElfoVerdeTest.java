import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoVerdeTest
{
    @Test
    public void elfoVerdeGanha2DeExperiencia()
    {
        ElfoVerde teste = new ElfoVerde("Legolas");
        
        teste.atirarFlecha(new Dwarf("balin"));
        assertTrue(teste.getExperiencia() == 2);
    }
    
    @Test
    public void elfoVerdeGanha6Experiencia()
    {
        ElfoVerde teste = new ElfoVerde("Legolas");
        
        teste.atirarFlecha(new Dwarf("balin"));
        teste.atirarFlecha(new Dwarf("baulin"));
        teste.atirarFlecha(new Dwarf("baslin"));
        assertTrue(teste.getExperiencia() == 6);
    }
    
    @Test
    public void elfoVerdeAtiraFlechaEmUmDwarf() {
        ElfoVerde arwen = new ElfoVerde("Arwen");
        arwen.atirarFlecha(new Dwarf("Gimli"));
        assertEquals(41, arwen.getFlecha());
        assertEquals(2, arwen.getExperiencia());
    }
    
    @Test
    public void adicionarItemCorretoNoElfoVerde(){
        ElfoVerde teste = new ElfoVerde("Bozo");
        
        teste.adicionarItem(new Item(2,"Arco e Flecha de Vidro"));
        teste.adicionarItem(new Item(1,"Espada de Aço valiriano"));
        
        assertTrue(teste.getInventario().getItens().get(0).getDescricao().equalsIgnoreCase("Arco e Flecha de Vidro"));
        assertTrue(teste.getInventario().getItens().get(1).getDescricao().equalsIgnoreCase("Espada de Aço valiriano"));
    }
    
    
    @Test
    public void adicionarItemErradoNoElfoVerde(){
        ElfoVerde teste = new ElfoVerde("Bozo");
        
        teste.adicionarItem(new Item(2,"Batatas"));
        
        assertTrue(teste.getInventario().getItens().size() == 0);
    }
}
