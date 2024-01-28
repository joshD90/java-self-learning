package errorHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void convertString(String str) {

        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted Number = " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Number format");
            e.printStackTrace();
        } finally {
            delayExit();

        }
    }

    // multiple catches
    public static void addStringNum(String[] strArray) {
        try {
            int result = 10 / Integer.parseInt(strArray[0]);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        } finally {
            delayExit();
        }
    }

    // with a finally block and io exeption
    public static void readFromFile(String fileName) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
            delayExit();
        }
    }

    private static void delayExit() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Press Enter Key to Continue...");
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
