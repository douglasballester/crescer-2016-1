import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ExercitoDeElfosTest
{    
    @Test
    public void InvitarElfoNormal(){
        ExercitoDeElfos teste = new ExercitoDeElfos();
        Elfo e1 = new Elfo("haldir");
        
       teste.alistarElfo(e1);
       
       assertEquals(false, teste.getExercitoDeElfos().containsValue(e1));
    }
}
