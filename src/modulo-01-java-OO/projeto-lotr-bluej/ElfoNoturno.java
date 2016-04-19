/*Atualmente os Elfos Noturnos podem morrer atirando flechas? Justifique.
 * Não, pois ele perde 5% de vida e não 100%. Logo ele vai ficar diminuindo até chegar 
 * em um numero menor que 1 com inumeras casas decimas, porém nunca chega a 0.*/
public class ElfoNoturno extends Elfo
{   
    private double danoTomado;
    
    public ElfoNoturno(String nome)
    {
        super(nome);
    }
    
    @Override
    public void atirarFlecha(Dwarf dwarf)
    {
        danoTomado = vida * 0.05; 
        super.atirarFlecha(dwarf);
        experiencia += 2;
        vida -= danoTomado;
        if(vida < 1){
            status = Status.MORTO;
        }
    }
}
