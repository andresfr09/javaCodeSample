package co.edu.udem.devops.taller1.Taller14F.ws.rest;


import co.edu.udem.devops.taller1.Taller14F.ws.interfaces.IWeatherDAO;
import co.edu.udem.devops.taller1.Taller14F.ws.models.WeatherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongoweather")
public class RepoController {

    @Autowired
    private IWeatherDAO repositorio;

    @PostMapping("/mongoweather/post")
    public WeatherDTO create(@Validated @RequestBody WeatherDTO w){
        return repositorio.insert(w);
    }

    @GetMapping("/mongoweather")
    public List<WeatherDTO> getAll(){
        return repositorio.findAll();
    }

    @PutMapping("/mongoweather/{id}")
    public WeatherDTO update(@PathVariable String id, @Validated @RequestBody WeatherDTO w){
        return repositorio.save(w);
    }

    @DeleteMapping("/mongoweather/{id}")
    public void delete(@PathVariable String id){
        repositorio.deleteById(id);

    }



}
