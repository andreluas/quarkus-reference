package br.com.vertigo.employee.health;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.HttpMethod;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.Readiness;

import io.smallrye.health.checks.UrlHealthCheck;

@ApplicationScoped
public class CustomHealthCheck {

    @ConfigProperty(name = "superheros-api/mp-rest/url")
    String externalAPI;

    @Readiness
    HealthCheck checkAPI() {

        return new UrlHealthCheck(externalAPI + "/heros")
                .name("Heros API")
                .requestMethod(HttpMethod.GET)
                .statusCode(200);
    }
}
