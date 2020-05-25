public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] numbers = new int[4][4];

        for (int row = 0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length; col++){
                if (col != row){
                System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
