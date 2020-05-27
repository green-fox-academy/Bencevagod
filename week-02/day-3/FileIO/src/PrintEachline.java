import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachline {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get("assets/exercise.txt");
            lines = Files.readAllLines(filePath);
        } catch (IOException e){
            System.out.println("There's no such file");
            System.exit(2);
        }
        for (String line : lines){
            System.out.println(line);
        }
    }
}
