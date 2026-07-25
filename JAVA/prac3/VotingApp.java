class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class VotingApp {
    static void checkAge(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You must be atleast 18 years old to vote!");
        }
        System.out.println("You are eligible to vote.");
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (UnderageException e) {
            System.out.println("Custom erros: " + e.getMessage());
        }
    }
}