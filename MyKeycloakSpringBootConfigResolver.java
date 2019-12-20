package org.keycloak.quickstart.springboot;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.adapters.KeycloakDeploymentBuilder;
import org.keycloak.adapters.spi.HttpFacade;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
 * @See https://stackoverflow.com/questions/57787768/issues-running-example-keycloak-spring-boot-app
 */
@Configuration
public class MyKeycloakSpringBootConfigResolver extends KeycloakSpringBootConfigResolver {
    private final KeycloakDeployment keycloakDeployment;

    public MyKeycloakSpringBootConfigResolver(KeycloakSpringBootProperties properties) {
        keycloakDeployment = KeycloakDeploymentBuilder.build(properties);
    }

    @Override
    public KeycloakDeployment resolve(HttpFacade.Request facade) {
        return keycloakDeployment;
    }

    @Bean
    @Primary
    public KeycloakConfigResolver keycloakConfigResolver(KeycloakSpringBootProperties properties) {
        return new MyKeycloakSpringBootConfigResolver(properties);
    }
}