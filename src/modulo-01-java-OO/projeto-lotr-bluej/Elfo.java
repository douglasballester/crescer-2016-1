public class Elfo extends Personagem
{
    protected int flecha = 42;
    protected static int contElfo = 0;
     public Elfo(String nome){
        super(nome);
        this.vida = 100;
        contElfo++;
    }
    
    public Elfo(String nome, int flecha){
        super(nome);
        this.flecha = flecha;
        this.vida = 100;
        contElfo++;
    }
   
    public void atirarFlecha(Dwarf dwarf)
    {
         experiencia++;
         flecha--;
         dwarf.perdeVida();
    }
    
    public static int getContElfo(){
        return contElfo;
    }
    
    public int getFlecha(){
        return this.flecha;
    } 
    
    public boolean equals(Object obj){
        Elfo outro = (Elfo)obj;
        return super.equals(outro) && this.flecha == outro.flecha;
    }
    
    public String toString() {

        boolean flechaNoSingular = Math.abs(this.flecha) == 1;
        boolean experienciaNoSingular = Math.abs(this.experiencia) == 1;

        return String.format("%s possui %d %s e %d %s de experiência.",
            this.nome,
            this.flecha,
            flechaNoSingular ? "flecha" : "flechas",
            this.experiencia,
            experienciaNoSingular ? "nível" : "níveis");
    }
    
    public void tentarSorte(){
        System.out.println("Elfo tentou a sorte");
    }
}
