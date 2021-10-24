package co.edu.udem.devops.taller1.Taller14F.ws.service;


import co.edu.udem.devops.taller1.Taller14F.ws.rest.WeatherRoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {
    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);
    private static final  String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";
    private static final  String API_KEY = "fe740e8847085cae43cb559b7619bfe9";

    public WeatherRoot getWeatherBy(String zip, String country) {
        RestTemplate restTemplate = new RestTemplate();
        String urlRestWS = String.format("%s?units=metric&zip=%s,%s&APPID=%s",
                WEATHER_URL,
                zip,
                country,
                API_KEY);
        WeatherRoot weatherRoot = restTemplate.getForObject(urlRestWS, WeatherRoot.class);
        if(weatherRoot != null){
            log.info(weatherRoot.toString());
        }
        return weatherRoot;
    }
}
