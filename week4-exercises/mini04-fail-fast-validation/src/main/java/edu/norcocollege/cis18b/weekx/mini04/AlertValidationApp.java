package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidationApp {
    public static void main(String[] args) {
        AlertValidator validator = new AlertValidator();

        Alert validAlert = new Alert(1, "CPU usage high", AlertLevel.WARNING);
        Alert invalidAlert = new Alert(2, "   ", null);

        // TODO: Validate the valid alert and print a success message.
        try{
        validator.validate(validAlert);
        System.out.println("Sucess");
        } catch (Exception ex){
            System.out.println("Failure: " + ex.getMessage());
        }

        // TODO: Validate the invalid alert and print the exception message.

        try{
            validator.validate(invalidAlert);
            System.out.println("Invalid Alert");
        } catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }

    }
}
