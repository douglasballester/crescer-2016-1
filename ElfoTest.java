

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoTest
{
    @Test
    public void criarElfoComNumeroFlechas(){
        Elfo teste = new Elfo();
        int esperado = 42;
        int obtido = teste.getFlecha();
        assertEquals(esperado, obtido);
    }
    
   @Test
    public void elfoPerdeFlecha(){
        Elfo teste = new Elfo(5, 42);
        Dwarf d1 = new Dwarf();
        teste.atirarFlecha(d1);
        
        int expEsperada = 6;
        int expObtida = teste.getExperiencia();
        assertEquals(expEsperada, expObtida);
        
        
        int flechaEsperado = 41;
        int flechaObtido = teste.getFlecha();
        assertEquals(flechaEsperado, flechaObtido);
        
        
    }
}