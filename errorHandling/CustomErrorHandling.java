package errorHandling;

import java.nio.file.InvalidPathException;

public class CustomErrorHandling {
    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty");
        }
        System.out.println("Valid input " + input);
    }

    public static void handleInput(String str) {
        try {
            validateInput(str);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
