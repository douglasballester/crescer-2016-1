import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class InventarioTest
{
    
     @Test
    public void AdicionaItemAoIventario(){
        Item teste = new Item(1, "batata");
        Inventario bag = new Inventario();
        bag.adicionarItem(teste);
        assertTrue(bag.getItens().size() == 1);
    }
    
    
    
    
    @Test
    public void RemoverItemDoInventario(){
        Item teste = new Item(2, "Cenouras");
        Inventario bag = new Inventario();
        bag.adicionarItem(teste);
        assertTrue(bag.getItens().size() == 1);
        bag.removerItem(teste);
        assertTrue(bag.getItens().size()== 0);
    }
    
}
