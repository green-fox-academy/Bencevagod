import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteALine {
    public static void main(String[] args) {
        List<String> content = new ArrayList<>();
        content.add("First line of my file");
        try {
            Path filePath = Paths.get("assets/new-file.txt");
            Files.write(filePath, content);
        } catch (IOException e){
            System.out.println("Shaize cannot write sorrey");
            System.exit(2);
        }
    }
}
