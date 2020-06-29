package Exercise11;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class FindFrequencyOfWords {
    public static void main(String[] args) {

        Path filePath = Paths.get("assets/wiki.txt");
//        try {
//            Arrays.stream(Files.readString(filePath)
//                    .split(" "))
//                    .filter(s -> !s.equals("."))
//                    .filter(s -> !s.equals(","))
//                    .collect(Collectors.groupingBy(Function.<String>identity(), HashMap::new, counting()))
//                    .entrySet().stream()
//                    .sorted(Map.Entry<String, Integer>.comparingByValue().reversed())
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
