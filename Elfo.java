
/**
 * Escreva a descrição da classe Elfo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Elfo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int experiencia;
    private int flecha = 42;
    private String nome;
    private Dwarf dwarf;

    public Elfo(){}
    public Elfo(int experiencia, int flecha, String nome)
    {
        // inicializa variáveis de instância
        this.experiencia = experiencia;
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
        return flecha;
    } 
    
    public int getExperiencia(){
        return this.experiencia;
    }
    
    public String toString(){
        return this.nome+ " possui "+ this.flecha+ " flechas e "+ this.experiencia+ " níveis de experiência";
    }
      
}
