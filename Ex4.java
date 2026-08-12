//Modele e implemente um método recursivo que 
// calculeo somatório dos números inteiros entre os números k ej, 
// passados como parâmetro.

public class Ex4{

    public static void main(String args[]){
        System.out.println(somaKJ(1, 5));
    }
    public static int somaKJ(int k, int j){
        if(k == j){
            return 1;
        }
        if(k < j){
            return k + somaKJ(k+1, j);
        }
        
            return somaKJ(j, k);
        
    }
}