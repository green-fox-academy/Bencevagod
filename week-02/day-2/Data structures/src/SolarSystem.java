import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        System.out.println(putSaturn(planetList));
    }
    public static ArrayList putSaturn (ArrayList arr){
        if (!arr.contains("Saturn")){
            arr.add(4, "Saturn");
        }
        return arr;
    }
}
