package pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model;

import lombok.Data;
import java.util.List;

@Data
public class StarWarsResponse {
    private List<StarWarsCharacter> results;
}