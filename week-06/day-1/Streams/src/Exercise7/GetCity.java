package Exercise7;

import java.util.Arrays;
import java.util.List;

public class GetCity {
    public static void main(String[] args) {
        findCitiesWithGivenChar("a");
    }

    public static void findCitiesWithGivenChar(String c) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        cities.stream()
                .filter(x -> x.startsWith(c.toUpperCase()))
                .forEach(System.out::println);
    }
}
