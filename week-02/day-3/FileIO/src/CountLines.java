import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String file = "exercise";
        countLines(file);
    }
    public static void countLines (String file){
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get("assets/"+file+".txt");
            lines = Files.readAllLines(filePath);
        } catch (IOException e){
            System.out.println(0);
            System.exit(2);
        }
        int numOfLines = 0;
        for (String s : lines){
            numOfLines++;
        }
        System.out.println(numOfLines);
    }
}
