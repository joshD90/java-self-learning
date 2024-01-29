package generics;

public class BasicGenericsMain {
    public static void Main(String[] args) {
        Pair<Integer, String> myPair = new Pair(1, "Some String");
        System.out.println(myPair.getKey());
        System.out.println(myPair.getValue());
    }
}
