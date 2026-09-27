package pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.BreweryData;

import java.util.List;

@FeignClient(
        name = "breweryClient",
        url = "https://api.openbrewerydb.org"
)

public interface BreweryClient {
    @GetMapping("/v1/breweries")
    List<BreweryData> getBreweries();
}
