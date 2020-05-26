import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
        System.out.println(matchMake(girls, boys));

    }
    public static ArrayList <String> matchMake(ArrayList<String> girls, ArrayList<String> boys){
        ArrayList<String> returningList = new ArrayList<>();

        int size = girls.size()>boys.size()?boys.size():girls.size();
        for (int i = 0; i < size; i++){
            returningList.add( girls.get(i));
            returningList.add(boys.get(i));
        }
        returningList.add(boys.get(boys.size()-1));
        return returningList;
    }
}
