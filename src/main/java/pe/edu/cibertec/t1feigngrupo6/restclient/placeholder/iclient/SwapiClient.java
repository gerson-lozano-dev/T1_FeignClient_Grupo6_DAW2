package pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.StarWarsResponse;

@FeignClient(name = "swapiClient", url = "https://swapi.dev/api")
public interface SwapiClient {

    @GetMapping("/people/")
    StarWarsResponse obtenerPersonajes();
}