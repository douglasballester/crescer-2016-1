import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SindarinParaInglesTest
{
    @Test
    public void traduzirNaurParaIngles(){
        TradutorSindarin tradutorIngles = new SindarinParaIngles();
        assertEquals("fire", tradutorIngles.traduzir("naur"));
    }
    
    @Test
    public void traduzir5WordsEmSindarinParaIngles(){
        TradutorSindarin tradutorIngles = new SindarinParaIngles();
        assertEquals("fire", tradutorIngles.traduzir("naur"));
        assertEquals("water", tradutorIngles.traduzir("nen"));
        assertEquals("wind", tradutorIngles.traduzir("gwaew"));
        assertEquals("earth", tradutorIngles.traduzir("amar"));
        assertEquals("heart", tradutorIngles.traduzir("gûr"));
    }
}
