

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DataTerceiraEraTest
{
    
    @Test
    public void testeAnoBis(){
        DataTerceiraEra teste = new DataTerceiraEra(02,10,1994);
        
        boolean esperado = true;
        boolean obtido = teste.ehBissexto();
    }
    
   @Test
    public void testeAnoNaoBis(){
        DataTerceiraEra teste = new DataTerceiraEra(22,11,1900);
        
        boolean esperado = true;
        boolean obtido = teste.ehBissexto();
    }

}
