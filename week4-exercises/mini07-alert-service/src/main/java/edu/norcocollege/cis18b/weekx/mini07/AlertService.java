package edu.norcocollege.cis18b.weekx.mini07;

public class AlertService {
    private final AlertRepository repository;
    private final AlertValidator validator;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
        this.validator = new AlertValidator();
    }

    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException {
        // TODO: Validate the alert.
        // TODO: Save the alert.
        // TODO: Wrap unexpected errors in AlertProcessingException.
        
        try{
            validator.validate(alert);
            repository.save(alert);
        } catch(InvalidAlertException | AlertStorageException ex)
        {
            throw ex;
        }catch(Exception ex)
        {
            throw new AlertProcessingException("An unexpected problem occured", ex);
        }
    }
}
