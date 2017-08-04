package ramya.service;

import ramya.entity.Alerts;
import ramya.entity.Readings;
import ramya.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    Vehicle findOne(String vin);
    List<Vehicle> create(List<Vehicle> veh);
    Vehicle update(String vin, Vehicle veh);

    List<Readings> findAllReadings();
    Readings findOneReadings(String id);
    Readings createReadings(Readings reads);
    Readings updateReadings(String id, Readings reads);


}
