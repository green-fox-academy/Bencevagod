import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>();
        book.put("William A. Lathan", "405-709-1865");
        book.put("John K. Miller", "402-247-8568");
        book.put("Hortensia E. Foster", "606-481-6467");
        book.put("Amanda D. Newland", "319-243-5613");
        book.put("Brooke P. Askew", "307-687-2982");
        System.out.println(book.get("John K. Miller"));

        String getValue = "";
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (Objects.equals("307-687-2982", entry.getValue())) {
                getValue = entry.getKey();
            }
        }
        System.out.println(getValue);
        System.out.println(book.containsKey("Chris E. Myers"));
    }
}
