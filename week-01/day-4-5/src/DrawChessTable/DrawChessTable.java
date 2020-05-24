package DrawChessTable;

public class DrawChessTable {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++){
            if (i % 2 != 0){
                System.out.print(" ");
            }
            for (int j = 1; j < 7; j++){
                System.out.print("+ ");
            }
            System.out.println("+ ");
        }
    }
}
