import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SindarinParaPortuguesTest{
    @Test
    public void traduzirNaurParaPortugues(){
        TradutorSindarin tradutorPortugues = new SindarinParaPortugues();
        
        assertEquals("fogo", tradutorPortugues.traduzir("naur"));
    }
    
    @Test
    public void traduzir5PalavrasEmSindarinParaPortugues(){
        TradutorSindarin tradutorPortugues = new SindarinParaPortugues();
        assertEquals("fogo", tradutorPortugues.traduzir("naur"));
        assertEquals("água", tradutorPortugues.traduzir("nen"));
        assertEquals("vento", tradutorPortugues.traduzir("gwaew"));
        assertEquals("terra", tradutorPortugues.traduzir("amar"));
        assertEquals("coração", tradutorPortugues.traduzir("gûr"));
    }
    
}
