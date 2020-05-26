import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<>(Arrays.asList("bo", "anacond", "koal", "pand", "zebr"));
        System.out.println(appendA(far));

    }
    public static ArrayList<String> appendA (ArrayList<String> arr){
        String temp = "";
        for (int s = 0; s < arr.size(); s++) {
            temp = arr.get(s);
            temp += "a";
            arr.set(s, temp);
        }
        return arr;
    }
}
