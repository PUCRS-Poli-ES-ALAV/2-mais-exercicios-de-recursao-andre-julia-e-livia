import java.util.ArrayList;
import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(7, -20, 23, 10));
        System.out.println(findBiggest(ar));
    }

    public static int findBiggest(ArrayList<Integer> ar){
        if(ar.size() == 1){
            return ar.get(0);
        }
        int b = ar.remove(0);
        if(b > findBiggest(ar)){
            return b;
        }else{
            return findBiggest(ar);
        }
        
 } 
}
