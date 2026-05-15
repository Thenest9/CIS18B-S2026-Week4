package edu.norcocollege.cis18b.weekx.mini03;

public class AlertValidatorDemo {

    public static void validateAlert(Alert alert) throws InvalidAlertException {
        // TODO: Throw InvalidAlertException if the message is null or blank.
        if(alert.getMessage() == null || alert.getMessage().isBlank())
        {
            throw new InvalidAlertException("Message cannot be null or Blank");
        }
        // TODO: Throw InvalidAlertException if the level is null.
        if(alert.GetAlertLevel() == null)
        {
            throw new InvalidAlertException("Level is null");
        }
    }

    public static void main(String[] args) {
        Alert alert = new Alert(1, "", null);

        try {
            validateAlert(alert);
            System.out.println("Alert is valid.");
        } catch (InvalidAlertException ex) {
            System.out.println("Invalid alert: " + ex.getMessage());
        }
    }
}
