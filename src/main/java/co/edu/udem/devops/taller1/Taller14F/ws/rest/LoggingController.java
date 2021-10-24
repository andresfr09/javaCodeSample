package co.edu.udem.devops.taller1.Taller14F.ws.rest;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController

@SpringBootApplication
//@RequestMapping("weather")
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);
    @GetMapping("/generarLogInfo")
    public String generarLogInfo() {
        //codigo para generar el log usando slf4j
        logger.info("Test log info");
        return "Ok";
    }

    @GetMapping("/generarLogError")
    public String generarLogError() {

        logger.error("Test log error");
        return "Ok";
    }

    @GetMapping("/generarLogWarning")
    public String generarLogWarning() {

        logger.warn("Test log warning");
        return "Ok";
    }

    @GetMapping("/generarLogDebug")
    public String generarLogDebug() {
        logger.debug("Test log debug");
        return "Ok";
    }


}