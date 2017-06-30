package ramya.repository;


import ramya.entity.Alerts;
import ramya.entity.Readings;
import ramya.entity.Vehicle;

import java.util.List;

public interface VehicleRepository {

    List<Vehicle> findAll();
    Vehicle findOne(String vin);
    Vehicle create(Vehicle veh);
    Vehicle update(Vehicle veh);
    List<Readings> findAllReadings();
    Readings findOneReadings(String id);
    Readings createReadings(Readings readings);
    Readings updateReadings(Readings readings);
    Alerts generate(Alerts alert);
}
