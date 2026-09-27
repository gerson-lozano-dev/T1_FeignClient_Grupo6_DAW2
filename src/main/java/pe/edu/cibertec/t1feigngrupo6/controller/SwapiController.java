package pe.edu.cibertec.t1feigngrupo6.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo6.service.SwapiService;

import java.util.List;

@RestController
@RequestMapping("/api/swapi")
@RequiredArgsConstructor
public class SwapiController {

    private final SwapiService swapiService;

    @GetMapping("/personajes")
    public ResponseEntity<List<StarWarsCharacter>> listarPersonajes() {
        return ResponseEntity.ok(swapiService.obtenerPersonajesFemeninosAltos());
    }
}