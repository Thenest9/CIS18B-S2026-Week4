package edu.norcocollege.cis18b.weekx.mini07;

public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException {
        // TODO: Validate alert fields.
        if(alert==null)
        {
            throw new InvalidAlertException("Alert cannot be null");
        }
        if(alert.message()==null || alert.message().isBlank())
        {
            throw new InvalidAlertException(("Messgae cannot be null or blank"));
        }
        if(alert.level()==null)
        {
            throw new InvalidAlertException("Alert level cannot be null");
        }
    }
}
