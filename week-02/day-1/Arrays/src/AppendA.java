public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"Koal", "Pand", "Zebr"};
        for (int i = 0; i < animals.length; i++){
            animals[i] += "a";
            System.out.println(animals[i]);
        }
    }
}
