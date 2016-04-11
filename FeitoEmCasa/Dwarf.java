import java.util.*;
public class Dwarf{
    private int experiencia = 0 ,vida = 110;
    private String nome;
    private Status status = Status.VIVO;
    protected Inventario bag = new Inventario();
    private DataTerceiraEra dataNascimento;
    
    
    public Dwarf(String nome){
        this.vida = 110;
        this.nome = nome;
        this.dataNascimento = new DataTerceiraEra(1,1,1);
    
    }
    
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        this(nome);
        this.dataNascimento = dataNascimento;
    }
    
    
    public void perdeVida(){
        double numeroDaSorte = this.getNumeroSorte();
        
        if(getNumeroSorte() < 0){
            experiencia += 2;
        }
        else if(numeroDaSorte > 100){
            
            if(vida > 0){
                int vidaAposFlechada = vida - 10;
                
                if (vidaAposFlechada == 0){
                    status = Status.MORTO;
                }
                
                if (vida > 0){
                    vida = vidaAposFlechada;
                }
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
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public DataTerceiraEra getDataNascimento(){
        return dataNascimento;
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
    
    public double getNumeroSorte(){
        //return 101.0; unreacheable, pois o código abaixo não seria executado...!
        if(dataNascimento.ehBissexto() == true && (vida >=80 && vida <= 90)){
            return 101.0 * (-33); //-3333.0
        }
        else if(dataNascimento.ehBissexto() == false && (nome.equals("Seixas") || nome.equals("Meireles"))){
            return (101.0 * 33) % 100; //33,33
        }
        return 101.0;
    }
    
    public void tentarSorte(){
        double muitaSorte = getNumeroSorte();
        if(muitaSorte == -3333.0){    
               this.bag.ganhar1000UnidadesDeCadaItem();
        }
    }
 
    
    
    
    //Declarar um Objeto:
    //Dwarf gimli = null;
    
    
    //Criação(instanciação);
    //new Dwarf();
    //Dwarf d1 = new Dwarf();
    
    
    
    
}