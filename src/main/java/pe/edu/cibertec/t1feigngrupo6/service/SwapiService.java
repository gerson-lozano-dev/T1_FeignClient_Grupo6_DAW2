package pe.edu.cibertec.t1feigngrupo6.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.iclient.SwapiClient;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.StarWarsResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SwapiService {

    private final SwapiClient swapiClient;

    public List<StarWarsCharacter> obtenerPersonajesFemeninosAltos() {
        StarWarsResponse response = swapiClient.obtenerPersonajes();

        return response.getResults().stream()
                .filter(personaje -> "female".equalsIgnoreCase(personaje.getGender())) // Filtro de género
                .filter(personaje -> {
                    try {
                        int altura = Integer.parseInt(personaje.getHeight());
                        return altura > 160;
                    } catch (NumberFormatException e) {

                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}