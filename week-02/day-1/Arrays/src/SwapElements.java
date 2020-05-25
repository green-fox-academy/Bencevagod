public class SwapElements {
    public static void main(String[] args) {
        String[] order = {"first", "second", "third"};

        String temp = order[2];
        order[2] = order[0];
        order[0] = temp;

        for (int i = 0; i < order.length; i++){
            System.out.println(order[i]);
        }
    }
}
