import java.util.ArrayList;
import java.util.Arrays;

public class Ex7{

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(7, -20, 23, 10));

        System.out.println(somaArray(ar));
    }
    public static int somaArray(ArrayList<Integer> ar){
        if (ar.isEmpty()) {
            return 0;
        }

        int primeiro = ar.get(0);
        ar.remove(0);
        return primeiro + somaArray(ar);
    }
}