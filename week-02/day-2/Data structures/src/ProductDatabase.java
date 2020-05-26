import java.util.HashMap;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Eggs", 200);
        map.put("Milk", 200);
        map.put("Fish", 400);
        map.put("Apples", 150);
        map.put("Bread", 50);
        map.put("Chicken", 550);

        System.out.println(map.get("Fish"));

    }
}
