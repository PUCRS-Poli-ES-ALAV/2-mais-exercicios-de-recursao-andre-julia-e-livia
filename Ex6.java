public class Ex6 {
    public static void main(String[] args) {
        System.out.println(baseB(5));
    }
    public static String baseB(int n){
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "1";
        }
        return baseB(n / 2) + n % 2;
    }
}
