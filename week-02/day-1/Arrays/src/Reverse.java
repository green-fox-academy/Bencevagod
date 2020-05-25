public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int[] numberz = new int[5];

        //for (int i = numbers.length-1, j = 0; i >= 0; i--, j++){
          //  numberz[j] = numbers[i];
        //}
        for (int i = 0; i < numbers.length; i++) {
            numberz[i] = numbers[numbers.length-1-i];
        }
        numbers = numberz;
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
