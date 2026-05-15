package edu.norcocollege.cis18b.weekx.mini01;

public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};

        // TODO: Use try/catch to handle division by zero.
        // Expected friendly message example: Cannot divide by zero.
        try
        {
            int result = numerator/denominator;
            System.out.println("Result: "+ result);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Cannot Divide by Zero");
        }

        // TODO: Use try/catch to handle an invalid alert index.
        // Purposely try an out-of-range index so the catch block runs.
        // Expected friendly message example: Invalid alert index.
        try{
            String alert = alerts[4];
            System.out.println("Alert: " + alert);
        } catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Invalid alert index");
        }

        System.out.println("Program completed.");
    }
}
