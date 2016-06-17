package com.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/service")
public class ApplicationConfig extends ResourceConfig {

    // Register resources and providers using package-scanning.
    public ApplicationConfig() {
        packages("com.rest");
    }

}