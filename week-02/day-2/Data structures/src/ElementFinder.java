import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
    }
    public static String containsSeven(ArrayList<Integer> arr){
        boolean contains = false;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(7)) {
                contains = true;
            }
        }
        if (contains){
            return "Hoorray!";
        }
        return "Nooooo!";
    }
}
