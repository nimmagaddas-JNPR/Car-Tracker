package ramya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ramya.entity.Readings;
import ramya.service.VehicleService;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://mocker.egen.io", maxAge = 3600)
public class ReadingsController {

    @Autowired
    VehicleService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Readings> findAll() {
        return service.findAllReadings();
    }

    @RequestMapping(value ="readings/{id}", method = RequestMethod.OPTIONS, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings findOneReadings(@PathVariable("id") String id) {
        return service.findOneReadings(id);
    }

    @RequestMapping(value="/readings", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings createReadings(@RequestBody List<Readings> reads) {
        for (Readings read1 : reads) {
            return service.createReadings(read1);
        }
        return null;
    }

    @RequestMapping(value = "readings/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings updateReadings(@PathVariable("id") String id, @RequestBody Readings reads) {
        return service.updateReadings(id, reads);
    }



}




