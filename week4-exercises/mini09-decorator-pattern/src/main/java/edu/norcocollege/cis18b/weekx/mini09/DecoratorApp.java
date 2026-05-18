package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp {
    public static void main(String[] args) {
        Alert alert = new Alert(1, "CPU usage exceeded threshold", AlertLevel.CRITICAL);

        // TODO: Create a BasicAlertHandler.
        // TODO: Wrap it in LoggingAlertHandlerDecorator.
        // TODO: Handle the alert

        AlertHandler handler = new BasicAlertHandler();
        handler = new LoggingAlertHandlerDecorator(handler);
        
        handler.handle(alert);

    }
}
