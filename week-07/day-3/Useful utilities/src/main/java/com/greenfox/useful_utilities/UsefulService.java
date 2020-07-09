package com.greenfox.useful_utilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class UsefulService {

    private List<String> colors;
    private Random random;

    public UsefulService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public List<String> validate(String email) {
        List<String> valider;
        int kukacCounter = 0;
        int dotCounter = 0;
        for (char c : email.toCharArray()) {
            if (c == '@') {
                kukacCounter++;
            }
            if (c == '.') {
                dotCounter++;
            }
        }
        if (kukacCounter == 1 && dotCounter == 1) {
            valider = Arrays.asList(email + " is a valid email adress.", "green");
        }
        valider = Arrays.asList(email + "is not a valid email adress", "red");
        return valider;
    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }
}
