public class Ex2 {
    public static void main(String[] args) {
        System.out.println(soma(10));
    }
    public static int soma(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return n + soma(n-1);
        

    }       
}
