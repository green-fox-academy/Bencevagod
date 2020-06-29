package Exercise4;

import java.util.Arrays;
import java.util.List;

public class GetAverageOfOdds {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double average = numbers.stream()
                .filter(x -> x%2 != 0)
                .mapToInt(x -> x)
                .average()
                .orElse(0);

        System.out.println(average);
    }
}
