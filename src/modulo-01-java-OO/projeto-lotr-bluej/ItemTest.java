import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ItemTest
{
    
    @Test
    public void ganhar1000UnidadesCom0Item()
    {
        Item teste = new Item();
        
        teste.ganhar1000Unidades();
        
        assertEquals(teste.getQuantidade(),1000);
    }
    
    @Test
    public void ganhar1000UnidadesCom1Item()
    {
        Item teste = new Item(1,"Wand");
        
        teste.ganhar1000Unidades();
        
        assertEquals(teste.getQuantidade(),1001);
    }
    
    @Test
    public void ganhar1000UnidadesCom3Itns()
    {
        Item teste = new Item(1,"Wand");
        Item teste1 = new Item(2,"Guns");
        Item teste2 = new Item(5,"Sword");
        
        teste.ganhar1000Unidades();
        teste1.ganhar1000Unidades();
        teste2.ganhar1000Unidades();
        
        assertEquals(teste.getQuantidade(),1001);
        assertEquals(teste1.getQuantidade(),1002);
        assertEquals(teste2.getQuantidade(),1005);
    }
    
   @Test
   public void umItemIgualAoOutro() {
       Item item1 = new Item(1, "Espada");
       Item item2 = new Item(1, "Espada");
       assertEquals(item1, item2);
   }
     
   @Test
   public void umItemNaoEhIgualAoOutro() {
      Item item1 = new Item(1, "Espada");
      Item item2 = new Item(2, "Espada");
      assertTrue(!item1.equals(item2));
   }
}
