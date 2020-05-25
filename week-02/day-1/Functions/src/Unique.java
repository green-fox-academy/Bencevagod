import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        int[] nums = {1, 11, 34, 11, 52, 61, 1, 34};
        int[] uniqueNums = unique(nums);
        int[] erasedNulls = eraseNulls(uniqueNums);

        for (int i = 0; i <erasedNulls.length; i++){

            System.out.println(uniqueNums[i]);
        }
    }
    public static int[] unique (int[] a){
        int[] uniqueList = new int[a.length];
        for (int i = 0; i < a.length; i++){
            if (!isTrue(uniqueList, a[i])){
                uniqueList[i] = a[i];
            }
        }
        return uniqueList;
    }
    public static boolean isTrue (int[] arr, int value){
        boolean jelen = true;
        for (int item : arr) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
    public static int[] eraseNulls (int[] arr){
        int nulls = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                nulls++;
            }
        }
        int[] noNullArray = new int[arr.length - nulls];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                int j = 0;
                noNullArray[j] = arr[i];
                j++;

            }
        }
        return noNullArray;
    }
}
