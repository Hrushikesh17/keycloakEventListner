package com.example.keycloak;

import org.keycloak.Config;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;

public class MyEventListenerProviderFactory implements EventListenerProviderFactory {

    @Override
    public EventListenerProvider create(org.keycloak.models.KeycloakSession session) {
        return new MyEventListenerProvider();
    }

    @Override
    public void init(Config.Scope config) {
        // No config needed
    }

    @Override
    public void postInit(org.keycloak.models.KeycloakSessionFactory factory) {
        // No post init actions
    }

    @Override
    public void close() {
        // Nothing to close
    }

    @Override
    public String getId() {
        return "custom-login-logger";
    }
}
