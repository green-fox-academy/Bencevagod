import javax.naming.PartialResultException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        logs();
    }
    public static void logs() {
        List<String> logs = new ArrayList<>();
        ArrayList<String> uniqueIP = new ArrayList<>();
        ArrayList<String> get = new ArrayList<>();
        ArrayList<String> post = new ArrayList<>();
        Path filePath = Paths.get("assets/log.txt");
        try {
            logs = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.exit(2);
        }
        for (String line : logs) {
            String[] log = line.split(" ");
            if (!uniqueIP.contains(log[8])) {
                uniqueIP.add(log[8]);
            }
            if (log[11].equals("GET")) {
                get.add(log[11]);
            } else {
                post.add(log[11]);
            }
        }
        System.out.println("The number of uniqe IPs is: "+uniqueIP.size());
        System.out.println("GET: "+get.size()+" / "+"POST: "+post.size());
    }
}
