package stringBuilder;

import java.lang.StringBuilder;

public class MyStringBuilder {

    public static void main(String[] args) {
        System.out.println(repeat("Hello World ", 100));
        System.out.println(createLetterFinder('y', 'P', 1000));
    }

    public static String repeat(String str, int numRepeats) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRepeats + 1; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String createLetterFinder(char mainLetter, char hiddenLetter, int numLetters) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numLetters + 1; i++) {
            sb.append(mainLetter);
        }
        // not right at the end
        int randomNum = (int) (Math.random() * numLetters);
        System.out.println(randomNum);
        sb.insert(randomNum, hiddenLetter);
        return sb.toString();
    }
}