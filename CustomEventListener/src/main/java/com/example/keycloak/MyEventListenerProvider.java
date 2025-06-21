package com.example.keycloak;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

public class MyEventListenerProvider implements EventListenerProvider {

    @Override
    public void onEvent(Event event) {
        if ("LOGIN".equals(event.getType().toString())) {
            System.out.println("🔔 User login detected: " + event.getUserId());
        }
    }

    @Override
    public void onEvent(AdminEvent event, boolean includeRepresentation) {

    }

    @Override
    public void close() {
        // Nothing to close
    }
}
