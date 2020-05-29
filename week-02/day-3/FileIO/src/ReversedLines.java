import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        decrypt("reversed-lines");
    }
    public static void decrypt (String filename) {
        List<String> file = new ArrayList<>();
        Path filePath = Paths.get("assets/"+filename+".txt");
        try {
            file = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Cannot read file!");
            System.exit(2);
        }
        List<String> decrypted = new ArrayList<>();
        for ( String line : file) {
        StringBuilder builder = new StringBuilder();
            for (int j = line.length()-1; j >= 0; j--) {
                builder.append(line.charAt(j));
            }
            decrypted.add(builder.toString());
        }

        try {
            Files.write(filePath, decrypted);
        } catch (IOException e) {
            System.out.println("Cannot write file!");
            System.exit(2);
        }
    }

}
