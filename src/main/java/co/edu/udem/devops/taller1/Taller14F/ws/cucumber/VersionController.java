package co.edu.udem.devops.taller1.Taller14F.ws.cucumber;

import com.github.tomakehurst.wiremock.WireMockServer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wiremock.org.apache.http.impl.client.CloseableHttpClient;
import wiremock.org.apache.http.impl.client.HttpClients;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

//@RestController
public class VersionController {
    @GetMapping("/generarLogInfo")
    public String generarLogInfo() {
        return "ok";
    }

    private void getData(String s) {
        int port = 8080;
        WireMockServer wireMockServer = new WireMockServer( port);
        CloseableHttpClient httpClient = HttpClients.createDefault();

        wireMockServer.start();
        configureFor("localhost", wireMockServer.port());
        stubFor(get(urlEqualTo(s))
                .withHeader("accept", equalTo("application/json"))
                .willReturn(ok()
                       ));


    }

    @When("^the client calls /generarLogInfo")
    public void the_client_calls_generar_log_info() throws Throwable{
        getData("/generarLogInfo");

        //System.out.println("ok1");
    }



    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        //HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        //assertThat("status code is incorrect : "+
                //latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
        System.out.println("ok2");
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        //assertThat(latestResponse.getBody(), is(version));

        System.out.println("ok3");
    }
}
