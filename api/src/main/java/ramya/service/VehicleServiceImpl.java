package ramya.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ramya.entity.Alerts;
import ramya.entity.Readings;
import ramya.entity.Vehicle;
import ramya.exception.BadRequestException;
import ramya.exception.ResourceNotFoundException;
import ramya.repository.VehicleRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class VehicleServiceImpl implements VehicleService{


    @Autowired
VehicleRepository repository;


    //Vehicles
    @Transactional
    public List<Vehicle> findAll() {return repository.findAll();}

    @Transactional
    public Vehicle findOne(String vin) {
        Vehicle existing = repository.findOne(vin);
        if(existing == null)
        {
            //exception handling
           throw new ResourceNotFoundException("Employee with id" +vin+ "doesn't exists.");
        }
        return existing;
    }

    @Transactional
    public Vehicle create(Vehicle veh) {
        Vehicle existing = repository.findOne(veh.getVin());
        if (existing != null) {
            repository.update(veh);
        } else {
            repository.create(veh);

        }
        return veh;
    }

    @Transactional
    public Vehicle update(String vin, Vehicle veh) {
        Vehicle existing = repository.findOne(vin);
        if(existing==null){
            //exception handing 404 error
            //throw new ResourceNotFoundException("Employee with id" +vin+ "doesn't exists.");
        }
        return repository.update(veh);
    }

    //Readings

    @Transactional
    public List<Readings> findAllReadings() {return  repository.findAllReadings();}


    @Transactional
    public Readings findOneReadings(String id) {
        Readings existing = repository.findOneReadings(id);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle Reading with id " + id + " doesn't exist.");
        }
        return existing;
    }

    @Transactional
    public Readings createReadings(Readings read) {
        if (read != null) {
            Vehicle existing = repository.findOne(read.getId());
            if (existing != null) {
                throw new BadRequestException("Vehicle Reading with id " + read.getId() + " already exists.");

            }
             repository.createReadings(read);
        }
        else {
            String ID = UUID.randomUUID().toString();
            Vehicle existing = repository.findOne(ID);
            if (existing != null) {
                throw new BadRequestException("Vehicle Reading with id " + ID + " already exists.");

            }
            repository.createReadings(read);

        }
        return read;
    }



    @Transactional
    public Readings updateReadings(String id, Readings reads) {
        Readings existing = repository.findOneReadings(id);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle Readings with vin " + id + " doesn't exist.");
        }
        return repository.updateReadings(reads);
    }

    @Transactional
    public Alerts generate(Alerts alert) {
        return repository.generate(alert);
    }

}

