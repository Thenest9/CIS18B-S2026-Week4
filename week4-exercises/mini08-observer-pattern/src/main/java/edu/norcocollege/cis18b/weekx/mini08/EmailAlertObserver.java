package edu.norcocollege.cis18b.weekx.mini08;

public class EmailAlertObserver implements AlertObserver {
    @Override
    public void onAlert(Alert alert) {
        // TODO: Print an email notification message.
        System.out.println("EMAIL: "+ alert.message());
    }
}
