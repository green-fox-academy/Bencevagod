import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));
    }
    public static String quoteSwap(ArrayList<String> arr){
        String temp = arr.get(5);
        arr.set(5, arr.get(2));
        arr.set(2, temp);
        String quote = "";
        for (int i = 0; i < arr.size(); i++){
            quote += " "+arr.get(i);
        }
        return quote;
    }
}
