package co.edu.udem.devops.taller1.Taller14F.ws.rest;

/* import edu.udem.prqrdrs.dto.PersonaDto; */
import co.edu.udem.devops.taller1.Taller14F.ws.service.WeatherService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("weather")
public class WeatherController {

    WeatherService weatherService = null;

    @Autowired
    WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @ApiOperation(
            value = "Retorna el clima dependiendo de la locación y el país ",
            response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna los datos del clima JSON"),})
    @RequestMapping(value = "/findByZipAndCountry/{zip}/{country}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> findByZipAndCountry(@ApiParam(value = "Zip of the location", required = true) @PathVariable("zip") String zip,
                                                 @ApiParam(value = "Country of the location", required = true) @PathVariable("country") String country
    ) {
        WeatherRoot wea = null;
        if (!zip.isEmpty() &&  !country.isEmpty()) {
            wea = weatherService.getWeatherBy(zip, country);
            if (wea != null) {
                return new ResponseEntity<>(wea, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No se encontro info", HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity<>(new PersonaDto(), HttpStatus.BAD_REQUEST);
    }


    @ApiOperation(
            value = "Delete  el clima dependiendo de la locación y el país ",
            response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Delete los datos del clima JSON"),})
    @RequestMapping(value = "/deleteByZipAndCountry/{zip}/{country}", method = RequestMethod.DELETE)
    public String deleteByZipAndCountry(
            @ApiParam(value = "Zip of the location", required = true) @PathVariable("zip") String zip,
            @ApiParam(value = "Country of the location", required = true) @PathVariable("country") String country
    ) {
        return country;// new ResponseEntity<>(new PersonaDto(), HttpStatus.BAD_REQUEST);
    }


    @ApiOperation(
            value = "Update  el clima dependiendo de la locación y el país ",
            response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Delete los datos del clima JSON"),})
    @RequestMapping(value = "/putByZipAndCountry/{zip}/{country}", method = RequestMethod.PUT)
    public String putByZipAndCountry(
            @ApiParam(value = "Zip of the location", required = true) @PathVariable("zip") String zip,
            @ApiParam(value = "Country of the location", required = true) @PathVariable("country") String country
    ) {
        return "Actualizando: "+country;// new ResponseEntity<>(new PersonaDto(), HttpStatus.BAD_REQUEST);
    }

    @ApiOperation(
            value = "POST  el clima dependiendo de la locación y el país ",
            response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Delete los datos del clima JSON"),})
    @RequestMapping(value = "/postByZipAndCountry/{zip}/{country}", method = RequestMethod.POST)
    public String postByZipAndCountry(
            @ApiParam(value = "Zip of the location", required = true) @PathVariable("zip") String zip,
            @ApiParam(value = "Country of the location", required = true) @PathVariable("country") String country
    ) {
        return "Creando: "+country;// new ResponseEntity<>(new PersonaDto(), HttpStatus.BAD_REQUEST);
    }
}