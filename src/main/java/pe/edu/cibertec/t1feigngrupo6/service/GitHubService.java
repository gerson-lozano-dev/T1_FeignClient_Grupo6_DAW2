package pe.edu.cibertec.t1feigngrupo6.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.iclient.GitHubClient;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.GitHubUserDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GitHubService {

    private final GitHubClient gitHubClient;

    public List<GitHubUserDto> obtenerUsuariosFiltrados() {
        List<GitHubUserDto> usuarios = gitHubClient.obtenerUsuarios();

        return usuarios.stream()
                .filter(u -> u.getLogin() != null && u.getLogin().length() <= 5)
                .filter(u -> Boolean.FALSE.equals(u.getSiteAdmin()))
                .collect(Collectors.toList());
    }
}