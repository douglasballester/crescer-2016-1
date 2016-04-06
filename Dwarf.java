public class Dwarf{
    private int vida = 110;
    private String nome;
    
    
    public Dwarf(){}
    
    public Dwarf(String nome){
        this.vida = 110;
        this.nome = nome;
    }
    
    
    public void perdeVida(){
        vida = vida - 10;
    }
    
    public void setNome(String novoNome){
    nome = novoNome;
    }
    
    public String getNome(){
        return nome;
    }
    
    //Declarar um Objeto:
    //Dwarf gimli = null;
    
    
    //Criação(instanciação);
    //new Dwarf();
    //Dwarf d1 = new Dwarf();
    
    
    
    
}