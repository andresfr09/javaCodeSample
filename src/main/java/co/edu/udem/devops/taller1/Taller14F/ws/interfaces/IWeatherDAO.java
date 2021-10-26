package co.edu.udem.devops.taller1.Taller14F.ws.interfaces;

import co.edu.udem.devops.taller1.Taller14F.ws.models.WeatherDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWeatherDAO extends MongoRepository<WeatherDTO,String> {
}
