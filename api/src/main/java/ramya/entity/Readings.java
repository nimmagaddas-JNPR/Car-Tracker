package ramya.entity;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.util.UUID;


@NamedQuery(name = "Readings.findAllReading", query = "select reads from Readings reads")

@Entity
public class Readings {

    @Id
    private String id;
   private String vin;
    private int latitude;
    private int longitude;
    private String timestamp;
    private int fuelVolume;
    private int speed;
    private int engineHp;
    private int checkEngineLightOn;
    private int engineCoolantLow;
    private int cruiseControllOn;
    private int engineRpm;


@Embedded
private Tires tires;

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public Readings() {
        this.vin = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(int engineHp) {
        this.engineHp = engineHp;
    }

    public int getCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(int checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public int getEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(int engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public int getCruiseControllOn() {
        return cruiseControllOn;
    }

    public void setCruiseControllOn(int cruiseControllOn) {
        this.cruiseControllOn = cruiseControllOn;
    }

    public int getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }

    @Override
    public String toString() {
        return "Readings{" +
                "vin='" + vin + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timestamp='" + timestamp + '\'' +
                ", fuelVolume=" + fuelVolume +
                ", speed=" + speed +
                ", engineHp=" + engineHp +
                ", checkEngineLightOn=" + checkEngineLightOn +
                ", engineCoolantLow=" + engineCoolantLow +
                ", cruiseControllOn=" + cruiseControllOn +
                ", engineRpm=" + engineRpm +
                ", tires=" + tires +
                '}';
    }
}
