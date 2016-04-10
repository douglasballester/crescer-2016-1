import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest
{
    @Test
    public void getDescricaoItensSemItem(){
        Inventario bag = new Inventario();
     
        
        
        String obtido = bag.getDescricaoItens();
        assertEquals("", obtido);
    }
    
    
    
    
    @Test
    public void getDescricaoItensComUmItem(){
        Inventario bag = new Inventario();
        Item teste = new Item(1,"Couve");
        bag.adicionarItem(teste);
        
        String obtido = bag.getDescricaoItens();
        assertEquals("Couve", obtido);
    }
    
    
    @Test
    public void getDescricaoItensComTresItem(){
        Inventario bag = new Inventario();       
        Item item2 = new Item(1,"Off-hand");
        Item item3 = new Item(1,"head");
        bag.adicionarItem(new Item(1,"Staff")); //cria o item direto dentro  
        bag.adicionarItem(item2);                //da bag(Inventario)
        bag.adicionarItem(item3);
        
        String obtido = bag.getDescricaoItens();
        assertTrue(obtido.equalsIgnoreCase("sTAfF,OfF-haNd,hEAd"));
    }
    
    
    @Test//Com inventario vazio
    public void colocar1000UnidadesSemTerItens(){
        Inventario bag = new Inventario();
        bag.ganhar1000UnidadesDeCadaItem();
   
        assertTrue(bag.getItens().isEmpty());
    }
    
    @Test
    public void colocar1000UnidadesCom1Item(){
        Inventario bag = new Inventario();
        
        bag.adicionarItem(new Item(5, "bows"));
        bag.ganhar1000UnidadesDeCadaItem();
   
        assertEquals(1005, bag.getItens().get(0).getQuantidade());
    }
    
    @Test
    public void colocar1000UnidadesCom10Itens(){
        Inventario bag = new Inventario();
        
        for(int i=0; i < 10 ; i++){
            bag.adicionarItem(new Item(2, "bows"));
            bag.ganhar1000UnidadesDeCadaItem();
            assertEquals(1002, bag.getItens().get(i).getQuantidade());
        }
    }   
        
     @Test
        public void colocar1000UnidadesCom2Itens(){
            Inventario bag = new Inventario();
            bag.adicionarItem(new Item (2, "Hammers"));
            bag.ganhar1000UnidadesDeCadaItem();
            assertEquals(1002, bag.getItens().get(0).getQuantidade());
            bag.adicionarItem(new Item(15, "Arrows"));
            bag.ganhar1000UnidadesDeCadaItem();
            assertEquals(1015, bag.getItens().get(1).getQuantidade());
            
            
        }
        
     @Test
     public void itemMaisPopularComBagVazia(){
         Inventario bag = new Inventario();
         
         assertNull(bag.getItemMaisPopular());
         
     }
     
     @Test
     public void itemMaisPopularCom1ItemNaBag(){
         Inventario bag = new Inventario();
         bag.adicionarItem(new Item (2, "Reaper"));
         
         assertEquals(bag.getItemMaisPopular().getQuantidade(), 2);
         
     }
     
      @Test
     public void itemMaisPopularCom3ItensNaBag(){
         Inventario bag = new Inventario();
         bag.adicionarItem(new Item (2, "Reaper"));
         bag.adicionarItem(new Item (5, "Shield"));
         bag.adicionarItem(new Item (3, "Feet"));
         assertEquals(bag.getItemMaisPopular().getQuantidade(), 5);
         
     }
     
     
     
        
    }
    
    
    
    

