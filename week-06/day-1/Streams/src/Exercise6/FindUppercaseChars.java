package Exercise6;

import java.util.stream.Collectors;

public class FindUppercaseChars {
    public static void main(String[] args) {
        String testString = "MarAkeShI".chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char)c))
                .collect(Collectors.joining());
        System.out.println(testString);
    }
}
