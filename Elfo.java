
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
   

    /**
     * COnstrutor para objetos da classe Elfo
     */
    public Elfo(){}
    public Elfo(int experiencia, int flecha)
    {
        // inicializa variáveis de instância
        this.experiencia = experiencia;
        this.flecha = flecha;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void atirarFlecha()
    {
        // ponha seu código aqui
        flecha--;
        experiencia++;
   }
}
