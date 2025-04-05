package lesson17;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Catch5 {

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Your age is less than 18. Access denied.");
        } else {
            System.out.println("Welcome!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }
    }
}
