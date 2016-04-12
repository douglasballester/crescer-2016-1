

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DataTerceiraEraTest
{
    
    @Test
    public void testeAnoBis(){
        DataTerceiraEra teste = new DataTerceiraEra(02,10,1992);
        
        boolean esperado = true;
        boolean obtido = teste.ehBissexto();
        
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void criarAno1600QueEhBissexto() {
        // Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 1, 1600);
        // Act
        boolean obtido = data.ehBissexto();
        // Assert
        assertTrue(obtido);
     }
    
   @Test
    public void testeAnoNaoBis(){
        DataTerceiraEra teste = new DataTerceiraEra(22,11,1900);
        
        boolean obtido = teste.ehBissexto();
        assertFalse(obtido);
    }
}
