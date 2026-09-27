package pe.edu.cibertec.t1feigngrupo6.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model.GitHubUserDto;
import pe.edu.cibertec.t1feigngrupo6.service.GitHubService;

import java.util.List;

@RestController
@RequestMapping("/api/github")
@RequiredArgsConstructor
public class GitHubController {

    private final GitHubService gitHubService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<GitHubUserDto>> listarUsuarios() {
        return ResponseEntity.ok(gitHubService.obtenerUsuariosFiltrados());
    }
}