import java.util.ArrayList;

public class CandyShop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        System.out.println(sweets(arrayList));
    }
    public static ArrayList<Object> sweets(ArrayList<Object> arr){

        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i).toString().equals("2")){
                arr.set(i, "Croissant");
            } else if (arr.get(i).toString().equals("false")){
                arr.set(i, "Ice cream");
            }
        }
        return arr;
    }
}
