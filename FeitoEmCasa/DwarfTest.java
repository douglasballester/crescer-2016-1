import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DwarfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DwarfTest
{
    //Teste "REMOVIDO". Foi colocado junto com o teste de nascer com Status VIVO
    /*@Test
    public void criarDwarfComNomeE110DeVida(){
        Dwarf teste = new Dwarf("Thorin");
        int esperado = 110;
        int obtido = teste.getVida();
        assertEquals(esperado, obtido);
    }*/
    
    @Test
    public void DwarfPerdeVida(){
        Dwarf teste = new Dwarf("Thorin");
        int esperado = teste.getVida() - 10;
        int obtido = 100;
        assertEquals(esperado, obtido);
    }
    
   @Test
   public void dwarfNasceComStatusVivo(){
       Dwarf dwarf = new Dwarf("testem");
       assertEquals(Status.VIVO, dwarf.getStatus());
    }
    
    @Test
    public void dwarfNasceComNomeVivoE110deVida(){
        Dwarf dwarf = new Dwarf("Balin");
        assertEquals(dwarf.getNome(),"Balin");
        assertEquals(dwarf.getVida(), 110);
        assertEquals(dwarf.getStatus(), Status.VIVO); 
    
    
    }
    
    //Teste NOVO - commitar
    @Test
    public void dwarfGanhaExperienciaSemLevarFlechada(){
        Dwarf dwarf = new Dwarf("Thorin", new DataTerceiraEra(10,10,2016));
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        dwarf.perdeVida();
        
        assertEquals(90, dwarf.getVida());
        assertEquals(2, dwarf.getExperiencia());
        
        
        //ano tem que ser bissexto e vida entre 80 - 90
    }
    
    //Teste Novo
    @Test
    public void dwarfSeixasNaoGanhaExperiencia(){
        Dwarf seixas = new Dwarf("Seixas", new DataTerceiraEra(1,1,2015));
        
        seixas.getNumeroSorte();
        seixas.perdeVida();
        
        assertEquals(seixas.getExperiencia(), 0);
        
        
        //Dwarf nao ganha exp nem leva flechada, quando ano NAO for bissexto e
        //seu nome ser Seixas e seu numero da sorte estiver entre 0 e 100
    }
    
    //Teste Novo
    @Test
    public void dwarfMeirelesNaoGanhaExperiencia(){
        Dwarf meireles = new Dwarf("Meireles", new DataTerceiraEra(1,1,2015));
        
        meireles.getNumeroSorte();
        meireles.perdeVida();
        
        assertEquals(meireles.getExperiencia(), 0);
        
        
        //Dwarf nao ganha exp nem leva flechada, quando ano NAO for bissexto e
        //seu nome ser Seixas e seu numero da sorte estiver entre 0 e 100
    }
    
    //Acontece quando o numeroSorte dele for maior que 100, no caso 101
    @Test
    public void dwarfNaoLevFlechadaNemGanhaExperiencia() {
        // Arrange
        Dwarf dwarf = new Dwarf("IronFoot");
        // Act
        double resultado = dwarf.getNumeroSorte();
        // Assert
        assertEquals(101.0, resultado, 0.0);
    }
    
    @Test
    public void dwarfMorreCom0DeVida(){
        Dwarf dwarf = new Dwarf("Thorin");
        
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        assertEquals(dwarf.getStatus(), Status.MORTO);
    }
    
    //Teste NOVO - Commitar
    @Test
    public void dwarfNaoFicaCom20DeVidaNegativa(){
        Dwarf dwarf = new Dwarf("Thorin");
        
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        assertEquals(dwarf.getVida(), 0);
    }
    
    
    //Teste NOVO Commitar
    @Test
    public void dwarfComDataDeNasimento(){
        Dwarf dwarf = new Dwarf("Balin", new DataTerceiraEra(2,2,2));
        assertEquals(dwarf.getDataNascimento().getDia(), 2); 
        assertEquals(dwarf.getDataNascimento().getDia(), 2);
        assertEquals(dwarf.getDataNascimento().getDia(), 2);
    
    }
    
    
    @Test
    public void dwarfSemDataDeNasimento(){
        Dwarf dwarf = new Dwarf("IronFoot");
        assertEquals(dwarf.getDataNascimento().getDia(), 1); 
        assertEquals(dwarf.getDataNascimento().getDia(), 1);
        assertEquals(dwarf.getDataNascimento().getDia(), 1);
    
    }
    
    @Test
    public void adicionarItemNaBag(){
        Dwarf dwarf = new Dwarf("IronFoot");
        Item itemAdicionado = new Item(2,"Cenouras");
        
        dwarf.adicionarItem(itemAdicionado);
        
        assertEquals(itemAdicionado, dwarf.getInventario().getItens().get(0));
        assertEquals(1, dwarf.getInventario().getItens().size());
        
    }
    
    @Test
    public void PerderItemDaBag(){
        Dwarf dwarf = new Dwarf("IronFoot");
        Item itemAdicionado = new Item(2,"Pepinos");
        dwarf.adicionarItem(itemAdicionado);
        dwarf.perderItem(itemAdicionado);
        
        assertEquals(0, dwarf.getInventario().getItens().size());
                  
    }
    
    
  
}
   
