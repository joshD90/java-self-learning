package errorHandling;

public class ErrorHandlingMain {
    public static void main(String[] args) {
        Example1.convertString("123four");
        String[] stringArray = { "1", "2" };
        Example1.addStringNum(stringArray);
        Example1.readFromFile("./errorHandling/text.txt");
        CustomErrorHandling.handleInput("My Input");
    }

}
