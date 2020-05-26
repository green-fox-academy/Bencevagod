public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(toBeReversed));

    }
    public static String reverse(String str){
        String reversedOne = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reversedOne += str.charAt(i);
        }
        return reversedOne;
    }
}
