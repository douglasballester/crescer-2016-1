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
   
        assertTrue(bag.getInventarioItens().isEmpty());
    }
    
    @Test
    public void colocar1000UnidadesCom1Item(){
        Inventario bag = new Inventario();
        
        bag.adicionarItem(new Item(5, "bows"));
        bag.ganhar1000UnidadesDeCadaItem();
   
        assertEquals(1005, bag.getInventarioItens().get(0).getQuantidade());
    }
    
    @Test
    public void colocar1000UnidadesCom10Itens(){
        Inventario bag = new Inventario();
        
        for(int i=0; i < 10 ; i++){
            bag.adicionarItem(new Item(2, "bows"));
            bag.ganhar1000UnidadesDeCadaItem();
            assertEquals(1002, bag.getInventarioItens().get(i).getQuantidade());
        }
    }   
        
     @Test
        public void colocar1000UnidadesCom2Itens(){
            Inventario bag = new Inventario();
            bag.adicionarItem(new Item (2, "Hammers"));
            bag.ganhar1000UnidadesDeCadaItem();
            assertEquals(1002, bag.getInventarioItens().get(0).getQuantidade());
            bag.adicionarItem(new Item(15, "Arrows"));
            bag.ganhar1000UnidadesDeCadaItem();
            assertEquals(1015, bag.getInventarioItens().get(1).getQuantidade());
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
     
     @Test
     public void ordenarInventarioCom2Itens(){
         Inventario bag = new Inventario();
         
         Item item = new Item(4, "Swords");
         Item item2 = new Item(1, "Potion");
         //Item item3 = new Item(3, "Flask");
         
         bag.adicionarItem(item);
         bag.adicionarItem(item2);
         //bag.adicionarItem(item3);
         
         Inventario bagEsperada = new Inventario();
         
         bagEsperada.adicionarItem(item2);
         //bagEsperada.adicionarItem(item3);
         bagEsperada.adicionarItem(item);
         
         bag.ordenarItens();
         
         assertEquals(bag.getDescricaoItens(), bagEsperada.getDescricaoItens());
         
     }
     
     @Test
     public void ordenarInventarioCom3Itens(){
         Inventario bag = new Inventario();
         
         Item item = new Item(4, "Swords");
         Item item2 = new Item(1, "Potion");
         Item item3 = new Item(3, "Flask");
         //Item item4 = new Item(2, "OOOOOOOI");
         bag.adicionarItem(item);
         bag.adicionarItem(item2);
         bag.adicionarItem(item3);
         //bag.adicionarItem(item4);
         
         Inventario bagEsperada = new Inventario();
         
         bagEsperada.adicionarItem(item2);
         //bagEsperada.adicionarItem(item4);
         bagEsperada.adicionarItem(item3);
         bagEsperada.adicionarItem(item);
         
         bag.ordenarItens();
         
         assertEquals(bagEsperada.getDescricaoItens(), bag.getDescricaoItens());
         
     }
     
     @Test
     public void ordenarComInventarioVazio(){
         Inventario bag = new Inventario();
     
         bag.ordenarItens();
         
         assertEquals(bag.getDescricaoItens(),"");
     }
     
     @Test
     public void equalsComInventariosIguais(){
         Inventario a1 = new Inventario();
         Inventario a2 = new Inventario();
         Item b1 = new Item(1, "batata");
         Item b2 = new Item(2, "Tomates");
         
         a1.adicionarItem(b1);
         a1.adicionarItem(b2);
         a2.adicionarItem(b1);
         a2.adicionarItem(b2);
         
         assertEquals(a1, a2);
     }
     
     @Test
     public void equalsComInventarioVazio(){
         Inventario a1 = new Inventario();
         Inventario a2 = new Inventario();
         Item b1 = new Item();
         Item b2 = new Item();
         assertEquals(a1, a2);
     }
}
    
    
    
    

