package br.com.crescer.exerciciosaula01;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MeuCalendarioUtilTest {
    
    public MeuCalendarioUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testDiaDaSemanaQueNasceu() {
        System.out.println("diaDaSemanaQueNasceu");
        
        Date dataNascimento = new Date();
        
        
        MeuCalendarioUtil instance = new MeuCalendarioUtil();
        String expResult = "Quarta";
        String result = instance.diaDaSemanaQueNasceu(dataNascimento);
        assertEquals(expResult, result);
    }
    
}
