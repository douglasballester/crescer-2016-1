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
    @Test
    public void criarDwarfComVida(){
        Dwarf teste = new Dwarf("Thorin");
        int esperado = 110;
        int obtido = teste.getVida();
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void DwarfPerdeVida(){
        Dwarf teste = new Dwarf("Thorin");
        int esperado = teste.getVida() - 10;
        int obtido = 100;
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void dwarfNasceVivo(){
        Dwarf dwarf = new Dwarf("Balin");
        assertEquals(dwarf.getStatus(), Status.VIVO); 
    
    
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
    
    @Test
    public void dwarfPerde120() {
        Dwarf d1 = new Dwarf("Balin");
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        d1.perdeVida();
        assertEquals(0, d1.getVida());
        assertEquals(Status.MORTO, d1.getStatus());
    }
}
   
