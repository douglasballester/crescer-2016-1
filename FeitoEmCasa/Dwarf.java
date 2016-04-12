import java.util.*;
public class Dwarf extends Personagem{
    private DataTerceiraEra dataNascimento = new DataTerceiraEra(1,1,1);
   
    public Dwarf(String nome){
        super(nome);
        this.vida = 110;
    }
    
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome);
        this.dataNascimento = dataNascimento;
        this.vida = 110;
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
    
    public int getVida(){
        return vida;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public DataTerceiraEra getDataNascimento(){
        return dataNascimento;
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