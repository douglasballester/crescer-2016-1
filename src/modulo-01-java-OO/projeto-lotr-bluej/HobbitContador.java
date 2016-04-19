import java.util.*;
import java.util.ArrayList;
public class HobbitContador
{
    //retornar soma da diferença entre o produto e o mínimo múltiplo comum de cada par.
    public int calcularDiferenca(ArrayList<ArrayList<Integer>> arrayDePares){
        int num1 = 0 , num2 = 0 , mmc = 0, produto = 0;
        
        for(int i=0; i < arrayDePares.size(); i++){
            produto = arrayDePares.get(i).get(0) * arrayDePares.get(i).get(1) ; 
            num1 = arrayDePares.get(i).get(0);
            num2 = arrayDePares.get(i).get(1);
            
            
                if(num1 > num2)
                  mmc += calculaMmc(num1,num2);
                  else{
                      mmc += calculaMmc(num2,num1);
                   }
        }
            return produto - mmc;
    }

        
    public int calculaMmc(int num1, int num2){

    int resto, a, b, mmc;

    a = num1; //4 //15 //12
    b = num2; //5 //18 //60
    
        do {
            resto = a % b; //15

            a = b; //a = 5 //18
            b = resto; //b = 0 //15

        } while (resto != 0);
        mmc = (num1 * num2) / a;
        return mmc;
    }
    
   
    public int obterMaiorMultiploDeTresAte(int numero) {
        //ArrayList<Integer> multiplos = new ArrayList<>(Arrays.asList(0)); nao precisa arrayList
        int maiorMultiploTres = 0;
            for (int i = numero; i >= 1; i--) {
                if (i % 3 == 0) {
                    maiorMultiploTres = i;
                    break;
                    //continue;
                }
            }

       return maiorMultiploTres; //retornar um vetor inteiro? tem que retornar só o maior multiplo}
    }
 
    public ArrayList<Integer> obterMultiplosDeTresAte (int numero) {
        ArrayList<Integer> multiplo = new ArrayList<>(Arrays.asList());
                             //numero           
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) //break;
            multiplo.add(i);
        }

        return multiplo;
    }
}


