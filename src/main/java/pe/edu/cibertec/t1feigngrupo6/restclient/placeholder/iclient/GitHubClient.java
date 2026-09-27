package pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.GitHubUserDto;

import java.util.List;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface GitHubClient {

    @GetMapping(value = "/users", headers = "User-Agent=Spring-Boot-App")
    List<GitHubUserDto> obtenerUsuarios();
}