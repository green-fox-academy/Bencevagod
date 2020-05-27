import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteManyLines {
    public static void main(String[] args) {
        writeLines("assets/new-file.txt", "apple", 5);

    }
    public static void writeLines (String path, String content, int num){
        List<String> contents = new ArrayList<>();
        for (int i = 0; i < num; i++){
            contents.add(content);
        }
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, contents);
        } catch (IOException e){
            System.out.println("Seems like you cannot write into that file");
        }

    }
}
