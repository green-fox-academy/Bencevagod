import java.util.Arrays;
import java.util.ArrayList;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<String>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);
        listB.remove("Durian");
        listA.add(4, "Kiwifruit");
        boolean isBigger = listA.size()>listB.size();
        listA.indexOf("Avocado");
        listB.indexOf("Durian");
        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listA.get(2));
    }
}
