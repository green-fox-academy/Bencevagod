public class Unique {
    public static void main(String[] args) {
        int[] nums = {1, 11, 34, 11, 52, 61, 1, 34};
        unique(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static int[] unique (int[] a){
        int[] uniqueList = new int[a.length];
        for (int i = 0; i < a.length; i++){
            if (!isTrue(uniqueList, i)){
                uniqueList[i] = a[i];
            }
        }
        return uniqueList;
    }
    public static boolean isTrue (int[] b, int c){
        for (int i = 0; i < b.length; i++){
            if (b[i] != c){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
