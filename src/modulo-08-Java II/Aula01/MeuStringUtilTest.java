package br.com.crescer.exerciciosaula01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MeuStringUtilTest {
    
    public MeuStringUtilTest() {
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
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String string = "       ";
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = true;
        boolean result = instance.isEmpty(string);
        assertEquals(expResult, result);
    }

    @Test
    public void testContadorDeVogais() {
        System.out.println("contadorDeVogais");
        String string = "douglas";
        MeuStringUtil instance = new MeuStringUtil();
        int expResult = 3;
        int result = instance.contadorDeVogais(string);
        assertEquals(expResult, result);
    }

    @Test
    public void testInverteString() {
        System.out.println("inverteString");
        String string = "Biroska";
        MeuStringUtil instance = new MeuStringUtil();
        String expResult = "aksoriB";
        String result = instance.inverteString(string);
        assertEquals(expResult, result);
    }

    @Test
    public void testVerificaPalindromo() {
        System.out.println("verificaPalindromo");
        String string = "ovo";
        MeuStringUtil instance = new MeuStringUtil();
        boolean expResult = true;
        boolean result = instance.verificaPalindromo(string);
        assertEquals(expResult, result);
    }   
}
