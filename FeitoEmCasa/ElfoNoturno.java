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
