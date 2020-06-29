package Exercise10;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Fox> foxes = Arrays.asList(
                new Fox("Hablaty", "zold", 72),
                new Fox("Karima", "sarga", 3),
                new Fox("Harapos", "zold", 2),
                new Fox("Vuk", "veres", 5),
                new Fox("Vereb", "zold", 3)
        );

        foxes.stream()
                .filter(fox -> fox.getColor().equals("zold"))
                .forEach(fox -> System.out.println(fox.getName()));

        foxes.stream()
                .filter(fox -> fox.getColor().equals("zold") && fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox.getName()));

        //old one ******************************************
//        Map<String, Long> colorFrequency = foxes.stream()
//                .collect(Collectors.groupingBy(Fox::getColor))
//                .entrySet().stream()
//                .collect(Collectors.toMap(Map.Entry::getKey,
//                        e -> (long) e.getValue().size()));

        //new one ******************************************
        Map<String, Long> colorFrequency2 = foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));

        System.out.println(colorFrequency2);

    }

}
