import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Finance {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        int total = 0;
        int most = 0;
        int least = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i);
        }
        int average = total / items.size();
        Collections.sort(items);
        most = items.get(items.size()-1);
        least = items.get(0);
        System.out.println("Total spending: "+total);
        System.out.println("Average spending: "+average);
        System.out.println("Biggest expense: "+most);
        System.out.println("Smallest expense: "+least);
    }
}
