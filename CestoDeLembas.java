
/**
 * Write a description of class CestoDeLembas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CestoDeLembas
{
    private int numeroDeLembas;

    /**
     * Constructor for objects of class CestoDeLembas
     */
    public CestoDeLembas(int numeroDeLembas)
    {
        this.numeroDeLembas = numeroDeLembas;
    }

    public boolean podeDividirEmPares(){
        return numeroDeLembas > 2 && numeroDeLembas <= 100 && numeroDeLembas % 2 == 0;
        //Ternário
        //return podeDividir ? true : false;
    }
}
