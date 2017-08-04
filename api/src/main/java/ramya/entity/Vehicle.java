package ramya.entity;


import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@NamedQuery(name = "Vehicle.findAll", query = "select veh from Vehicle veh order by year DESC")

@Entity
public class Vehicle {

    @Id
    private String vin;
    private String make;
    private String model;
    private int year;
    private int redLineRpm;
    private int maxFuelVolume;
    private String lastServiceDate;

    @OneToMany
    private List<Readings> readings;

    public Vehicle() {
        this.vin = UUID.randomUUID().toString();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRedLineRpm() {
        return redLineRpm;
    }

    public void setRedLineRpm(int redLineRpm) {
        this.redLineRpm = redLineRpm;
    }

    public int getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(int maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", redLineRpm=" + redLineRpm +
                ", maxFuelVolume=" + maxFuelVolume +
                ", lastServiceDate='" + lastServiceDate + '\'' +
                '}';
    }
}