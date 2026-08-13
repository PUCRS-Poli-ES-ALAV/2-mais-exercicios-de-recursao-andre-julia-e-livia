public class Ex5 {
    public static void main(String[] args) {
        System.out.println(palindromo("ararar"));
    }

    public static boolean palindromo(String s){
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false; 

        }
        return palindromo(s.substring(1, s.length()-1));
    }
}
