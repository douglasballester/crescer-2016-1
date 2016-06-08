package br.com.crescer.exerciciosaula01;

/**
 *
 * @author DOUGLAS
 */
public class MeuStringUtil {
    
    public boolean isEmpty(String string){
        
        return string.trim().equals("");
        
    }
    
    public int contadorDeVogais(String string){
        int countVogais = 0;
       
        for(int i = 0; i < string.toLowerCase().length(); i++){
            switch(string.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                countVogais++;
                break;
            default:
            }
        }
        return countVogais;
    }
    
    public String inverteString(String string){
       return new StringBuilder(string).reverse().toString();
    }
    
    
    public boolean verificaPalindromo(String string){
        
        return string.trim().equalsIgnoreCase(inverteString(string).trim());
    }
    
    
    public static void main(String[] args){
        System.out.println("isEmpty(): Metodo que valida se String é vazia.");
        System.out.println("contadorDeVogais(): Metodo que conta quantas vogais tem na String.");
        System.out.println("inverteString(): Metodo que inverte a String.");
        System.out.println("verificaPalindromo(): Metodo que verifica se String é Palindroma.");
    }
    
}
