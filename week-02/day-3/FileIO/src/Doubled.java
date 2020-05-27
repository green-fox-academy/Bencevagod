import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
            List<String> charlist = new ArrayList<>();
            for (String line : contents) {
                List<String> charlistist = new ArrayList<>(Arrays.asList(line.split("")));
                for (int j = 0; j < charlist.size(); j++) {
                    //if (charList.get(j+1).equals(charList.get(j))) {
                    //charList.remove(j);
                    //}
                }
                charlist = charlistist;
            }

            //Files.write(filePath, contents);
            System.out.println(charlist);
        } catch (IOException e){
            System.out.println("Cant decrypt");
        }
    }
}
