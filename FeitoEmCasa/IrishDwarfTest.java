

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
    
    @Test
    public void equalsIrishDwarfComDataModificada(){
        DataTerceiraEra data = new DataTerceiraEra(2,3,2000);
        Dwarf d1 = new IrishDwarf("gimli", data);
        IrishDwarf d2 = new IrishDwarf("gimli",data);
        
        assertEquals(d1,d2);
    }
    
    @Test
    public void equalsIrishDwarfComDataPadrao(){
        Dwarf d1 = new IrishDwarf("gimli");
        IrishDwarf d2 = new IrishDwarf("gimli");
        
        assertEquals(d1,d2);
    }
    
    @Test
    public void equalsIrishDwarfSortudo(){
        IrishDwarf d1 = new IrishDwarf("kili", new DataTerceiraEra(1, 1, 1992));
        Dwarf d2 = new IrishDwarf("kili", new DataTerceiraEra(1, 1, 1992));
        
        Item item = new Item(3, "tauriel");
     
        d1.adicionarItem(item);
        d2.adicionarItem(item);
        
        d1.tentarSorte();
        d2.tentarSorte();
        
        d1.equals(d2);
     }
}
   
