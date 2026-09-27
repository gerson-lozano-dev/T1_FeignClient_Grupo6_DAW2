package pe.edu.cibertec.t1feigngrupo6.restclient.placeholder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GitHubUserDto {
    private Long id;
    private String login;

    @JsonProperty("site_admin")
    private Boolean siteAdmin;

    @JsonProperty("avatar_url")
    private String avatarUrl;
}