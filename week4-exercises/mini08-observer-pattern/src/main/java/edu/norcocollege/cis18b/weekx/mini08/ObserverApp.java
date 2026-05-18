package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp {
    public static void main(String[] args) {
        AlertService service = new AlertService();

        // TODO: Register at least two observers.
        // TODO: Process one alert.
        service.addObserver(new EmailAlertObserver());
        service.addObserver(new LogAlertObserver());

        Alert systemAlert = new Alert(5, "High CPU Detected", AlertLevel.CRITICAL);

        service.processAlert(systemAlert);

    }
}
