public class Dwarf{
    private int vida = 110;
    private String nome;
    private Status status = Status.VIVO;
    private Inventario bag = new Inventario();
    private DataTerceiraEra dataNascimento;
    
    
    public Dwarf(String nome){
        this.vida = 110;
        this.nome = nome;
        this.dataNascimento = new DataTerceiraEra(1,1,1);
    
    }
    
    
    public void perdeVida(){
    if(vida > 0){
        vida = vida - 10;
            if (vida == 0){
                status = Status.MORTO;
            }
    }
    }
    
    public void setNome(String novoNome){
        nome = novoNome;
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
    
    public void adicionarItem(Item itens){
        bag.adicionarItem(itens);
    }
    
    public void perderItem(Item itens){
        bag.removerItem(itens);
    }
    
    
    /*private void tirarVida(){
        this.vida -= 10;
    }*/
    
    
    
    //Declarar um Objeto:
    //Dwarf gimli = null;
    
    
    //Criação(instanciação);
    //new Dwarf();
    //Dwarf d1 = new Dwarf();
    
    
    
    
}