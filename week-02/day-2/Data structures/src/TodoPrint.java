public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        todoText = todoText.substring(0,0) + "My todo:\n " + todoText.substring(1);
        todoText += " - Download games\n   - Diablo";

        System.out.println(todoText);
    }
}
