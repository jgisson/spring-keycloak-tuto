package jgisson.spring.keycloak.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringKeycloakTutorialsApisController {

    @GetMapping(path = {"/", "/unsecured"})
    public String noSecuredEndpoint() {
        return "This is an unsecured endpoint payload";
    }

    @GetMapping(name = "/admin", produces = MediaType.TEXT_PLAIN_VALUE)
    public String adminSecuredEndpoint() {
        return "This is an ADMIN endpoint payload";
    }

    @GetMapping("/user")
    public String userSecuredEndpoint() {
        return "This is an USER endpoint payload";
    }

}
