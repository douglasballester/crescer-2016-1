public class Elfo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int experiencia;
    private int flecha = 42;
    private String nome;

    public Elfo(String nome){
        this.nome = nome;
    }
    public Elfo(String nome, int flecha)
    {
        this.flecha = flecha;
        this.nome = nome;
    }

    public void atirarFlecha(Dwarf dwarf)
    {
        experiencia++;
        flecha--;
        dwarf.perdeVida();
    }
    
    public int getFlecha(){
        return this.flecha;
    } 
    
    public int getExperiencia(){
        return this.experiencia;
    }
    
    public String getNome(){
        return this.nome;
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
      
}
