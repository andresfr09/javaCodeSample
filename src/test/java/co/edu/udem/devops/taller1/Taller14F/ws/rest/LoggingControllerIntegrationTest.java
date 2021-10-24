package co.edu.udem.devops.taller1.Taller14F.ws.rest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)

@WebMvcTest(LoggingController.class)
//@SpringBootTest(classes = LoggingController.class)
class LoggingControllerIntegrationTest {
    @Autowired
    private MockMvc mvc;

    // write test cases here

    @Test
    void generarLogInfo() throws Exception{
        mvc.perform(get("/generarLogInfo")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
        //.andExpect((ResultMatcher) content().string("Ok"))
        ;
    }

    @Test
    void generarLogError() throws Exception{
        mvc.perform(get("/generarLogError")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
        //.andExpect((ResultMatcher) content().string("Ok"))
        ;
    }

    @Test
    void generarLogWarning() throws Exception{
        mvc.perform(get("/generarLogWarning")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
        //.andExpect((ResultMatcher) content().string("Ok"))
        ;
    }

    @Test
    void generarLogDebug() throws Exception {


        mvc.perform(get("/generarLogDebug")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                //.andExpect((ResultMatcher) content().string("Ok"))
                ;
    }


}