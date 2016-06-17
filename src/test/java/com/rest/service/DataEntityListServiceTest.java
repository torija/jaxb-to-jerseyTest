package com.rest.service;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by T on 17/05/2016.
 */
public class DataEntityListServiceTest extends JerseyTest {

    public Application configure() {
        return new ResourceConfig(DataEntityListService.class);
    }

    @Test
    public void testGetDataEntityList() {
        Response response = target("/entities/list")
                .request()
                .get();

        assertEquals("Should return status 200", 200, response.getStatus());
        assertNotNull("Should return DataEntityList Json data", response.getEntity());

    }
}
