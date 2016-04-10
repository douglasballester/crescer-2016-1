import java.util.*;
public class Inventario{
    private ArrayList<Item> itens = new ArrayList<>() ;
    
    
    public Inventario(){
        itens = new ArrayList<Item>();
    }
    
     public void adicionarItem(Item item){
        itens.add(item);
    }
    
    public void removerItem(Item item){
        itens.remove(item);
    }
    
    public ArrayList<Item> getItens(){
        return itens;
    }
    
    public String getDescricaoItens(){
        String listarItens = "";
        for(int i = 0; i < itens.size(); i++){
            listarItens += itens.get(i).getDescricao() + "," ;
        }   
        
        return !itens.isEmpty() ? listarItens.substring(0, listarItens.length() - 1) : listarItens;
    }
    
    public void ganhar1000UnidadesDeCadaItem(){
        for(int i=0; i < itens.size(); i++){
            itens.get(i).ganhar1000Unidades();
        }
        
    }
    
    public Item getItemMaisPopular(){
        int indice = 0 ,maiorQtd = 0;
        for (int i = 0; i < itens.size(); i++){
            int qtdAtual = itens.get(i).getQuantidade();
            if (qtdAtual > maiorQtd){
                maiorQtd = qtdAtual;
                indice = i;
            }
        }
        
        return !this.itens.isEmpty() ? this.itens.get(indice) : null;
        /*retorna null se não tiver item. Para evitar que quando o metodo seja
        chamado aponte para uma posicao que nao exista ? Perguntar*/ 
    }
    
    
   
}