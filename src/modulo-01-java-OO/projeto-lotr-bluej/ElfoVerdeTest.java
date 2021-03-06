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
    public void adicionarItemCorretoNoElfoVerde(){
        ElfoVerde teste = new ElfoVerde("Bozo");
        
        teste.adicionarItem(new Item(2,"Arco e Flecha de Vidro"));
        teste.adicionarItem(new Item(1,"Espada de Aço valiriano"));
        
        assertTrue(teste.getInventario().getInventarioItens().get(0).getDescricao().equalsIgnoreCase("Arco e Flecha de Vidro"));
        assertTrue(teste.getInventario().getInventarioItens().get(1).getDescricao().equalsIgnoreCase("Espada de Aço valiriano"));
    }
   
    @Test
    public void adicionarItemErradoNoElfoVerde(){
        ElfoVerde teste = new ElfoVerde("Bozo");
        
        teste.adicionarItem(new Item(2,"Batatas"));
        
        assertTrue(teste.getInventario().getInventarioItens().size() == 0);
    }
    
    @Test
    public void adicionar1ItemErradoE1CertoNoElfoVerde(){
        ElfoVerde teste = new ElfoVerde("Bozo");
        
        teste.adicionarItem(new Item(2,"Batatas"));
        teste.adicionarItem(new Item(1,"Arco e Flecha de Vidro"));
        
        assertTrue(teste.getInventario().getInventarioItens().size() == 1);
        assertTrue(teste.getInventario().getInventarioItens().get(0).getDescricao().equalsIgnoreCase("Arco e Flecha de Vidro"));
    }
    
    @Test
    public void equalsElfoVerdeCom2ItensAdicionados(){
        Elfo greenElf = new ElfoVerde("teste");
        Elfo greenElfJr = new ElfoVerde("teste");
        
        greenElf.adicionarItem(new Item(2,"Arco e Flecha de Vidro"));
        greenElf.adicionarItem(new Item(1,"Espada de Aço valiriano"));
        greenElfJr.adicionarItem(new Item(2,"Arco e Flecha de Vidro"));
        greenElfJr.adicionarItem(new Item(1,"Espada de Aço valiriano"));
        
        assertEquals(greenElf,greenElfJr);
    }
}
