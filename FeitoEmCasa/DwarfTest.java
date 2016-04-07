

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
        Dwarf teste = new Dwarf();
        int esperado = 110;
        int obtido = teste.getVida();
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void DwarfPerdeVida(){
        Dwarf teste = new Dwarf();
        int esperado = teste.getVida() - 10;
        int obtido = 100;
        assertEquals(esperado, obtido);
    }
    
    
}
   
