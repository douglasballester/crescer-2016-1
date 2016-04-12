

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class IrishDwarfTest{
    
    @Test
    public void irishDwarfSortudoGanha6000UnidadesDeItem(){
        Item item = new Item(3, "batatas");
        DataTerceiraEra data = new DataTerceiraEra(1,1,1992);
        IrishDwarf jr = new IrishDwarf("Gim" , data);
        
        jr.perdeVida();
        jr.perdeVida();
        jr.perdeVida();
        
        jr.adicionarItem(item);
        jr.tentarSorte();
        
       assertEquals(-3333.0, jr.getNumeroSorte(), 0.1);
       assertEquals(6003, jr.getInventario().getInventarioItens().get(0).getQuantidade());
        
    }
    
    @Test
    public void irishDwarfSortudoGanhaMuitasUnidadesDeVariosItens(){
        Item item = new Item(3, "batatas");
        Item item1 = new Item(2, "Couves");
        DataTerceiraEra data = new DataTerceiraEra(1,1,1992);
        IrishDwarf jr = new IrishDwarf("Gim" , data);
        
        jr.perdeVida();
        jr.perdeVida();
        jr.perdeVida();
        
        jr.adicionarItem(item);
        jr.adicionarItem(item1);
        jr.tentarSorte();
        
       assertEquals(-3333.0, jr.getNumeroSorte(), 0.1);
       assertEquals(6003, jr.getInventario().getInventarioItens().get(0).getQuantidade());
       assertEquals(3002, jr.getInventario().getInventarioItens().get(1).getQuantidade());
        
    }
    
    @Test
     public void irishDwarfSortudoGanhaMuitasUnidadesComInventarioVazio()
     {
         IrishDwarf jr = new IrishDwarf("HMM", new DataTerceiraEra(1,1,1992));
         
         jr.perdeVida();
         jr.perdeVida();
         
         
         jr.tentarSorte();
         
         assertTrue(jr.getInventario().getInventarioItens().isEmpty());
    }   
    
    
  
}
   
