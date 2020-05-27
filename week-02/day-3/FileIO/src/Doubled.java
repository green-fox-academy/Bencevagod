import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        doubled();
    }
    public static void doubled (){
        List<String> contents= new ArrayList<>();
        try {
            Path filePath = Paths.get("assets/duplicated-chars.txt");
            contents = Files.readAllLines(filePath);
            List<Character> charList = new ArrayList<>();
            for (String line : contents){
                for (int j = 0; j < line.toCharArray().length-1; j+=2){
                    contents.remove(j);
                }
            }
            //Files.write(filePath, contents);
            System.out.println(contents);
        } catch (IOException e){
            System.out.println("Cant decrypt");
        }
    }
}
