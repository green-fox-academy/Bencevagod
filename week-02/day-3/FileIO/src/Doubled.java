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
            Path readFilePath = Paths.get("assets/duplicated-chars.txt");
            Path writeFilePath = Paths.get("assets/new-file.txt");
            contents = Files.readAllLines(readFilePath);
            List<String> newContent = new ArrayList<>();
            for (String line : contents) {
                StringBuilder builder = new StringBuilder();
                //List<String> charlistist = new ArrayList<>(Arrays.asList(line.split("")));
                for (int i = 0; i < line.toCharArray().length; i += 2) {
                    builder.append(line.charAt(i));
                }
                //for (int j = 0; j < charlistist.size() - 1; j++) {
                    //if (charlistist.get(j).equals(charlistist.get(j+1))) {
                      //  builder.append(j);
                    //}
                newContent.add(builder.toString());
                }

            Files.write(writeFilePath, newContent);
            //System.out.println(newContent);
        } catch (IOException e){
            System.out.println("Cant decrypt");
        }
    }
}
