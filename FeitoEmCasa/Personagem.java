public class Personagem
{
    protected int experiencia = 0;
    protected String nome;
    protected Inventario bag = new Inventario();
    protected Status status = Status.VIVO;
    protected int vida = 110;
    
    
    public Personagem(String nome){
        this.nome = nome;    
    }
   
   
    public String getNome(){
        return nome;
    }
    
    public int getVida(){
        return vida;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
   
    public Inventario getInventario(){
        return bag;
    }
    
    public void adicionarItem(Item itens){
        bag.adicionarItem(itens);
    }
    
    public void perderItem(Item itens){
        bag.removerItem(itens);
    }
    
    
  
}