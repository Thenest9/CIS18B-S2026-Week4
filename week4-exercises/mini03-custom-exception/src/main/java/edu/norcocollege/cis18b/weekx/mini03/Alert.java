package edu.norcocollege.cis18b.weekx.mini03;

public class Alert {
    /** TODO: Add id, message, and level to the Alert class */
    int id;
    String message;
    AlertLevel level;
    public Alert(int id, String message, AlertLevel level) {
        this.id = id;
        this.message = message;
        this.level = level;
    }

    /* TODO: Create getters and setters for this as well */
    public int getId()
    {
        return id;
    }
    public String getMessage()
    {
        return message;
    }
    public AlertLevel GetAlertLevel()
    {
        return level;
    }
}
