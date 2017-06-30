package ramya.entity;


import java.security.Timestamp;
import java.util.UUID;

public class Alerts {

    private String alertid;
    private String description;
    private String priority;
    private String Vin;
    private Timestamp timestamp;

    public Alerts() {
        this.alertid = UUID.randomUUID().toString();
    }


    public String getVin() {
        return Vin;
    }

    public void setVin(String vin) {
        Vin = vin;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getAlertid() {
        return alertid;
    }

    public void setAlertid(String alertid) {
        this.alertid = alertid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }



    @Override
    public String toString() {
        return "Alerts{" +
                "alertid='" + alertid + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", Vin='" + Vin + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
