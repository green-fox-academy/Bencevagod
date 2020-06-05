import java.util.ArrayList;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
        int[] nums = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(unique(nums));
        }

    public static List<Integer> unique (int[] a){
        List<Integer> uniqueList = new ArrayList<>();
        for (int value : a) {
            if (!isInList(uniqueList, value)) {
                uniqueList.add(value);
            }
        }
        return uniqueList;
    }

    public static boolean isInList(List<Integer> arr, int value){
        for (int item : arr) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

}
