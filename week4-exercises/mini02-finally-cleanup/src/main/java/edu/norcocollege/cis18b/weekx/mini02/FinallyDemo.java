package edu.norcocollege.cis18b.weekx.mini02;

public class FinallyDemo {
    public static void main(String[] args) {
        // TODO: Print "Opening alert stream..."
        System.out.println("Opening alert stream...");
        try {
            // TODO: Intentionally throw a RuntimeException with a helpful message.
            throw new RuntimeException("Connection Failed");
        } catch (RuntimeException ex) {
            // TODO: Print the error message in a friendly format.
            System.out.println("Handling error: " + ex.getMessage());
        } finally {
            // TODO: Print "Closing alert stream..."
            System.out.println("Closing alert...");
        }
    }
}
