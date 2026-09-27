package pe.edu.cibertec.t1feigngrupo6.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.BreweryData;
import pe.edu.cibertec.t1feigngrupo6.service.BreweryService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/breweries")
public class BreweryController {

    private final BreweryService breweryService;

    @GetMapping("/micro-california")
    public List<BreweryData> getBreweries() {

        return breweryService.getBreweries();
    }

}