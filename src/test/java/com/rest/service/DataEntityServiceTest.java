package com.rest.service;

import com.rest.generated.DataEntity;
import com.rest.generated.Status;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;

import static org.junit.Assert.assertTrue;

/**
 * Created by T on 17/05/2016.
 */
public class DataEntityServiceTest extends JerseyTest {

    public Application configure() {
        return new ResourceConfig(DataEntityService.class);
    }

    @Test
    public void testCreateDataEntity() {

        DataEntity dataEntity = new DataEntity();

        dataEntity.setId("1");
        dataEntity.setName("One");
        dataEntity.setDescription("First");
        dataEntity.setQuantity(1);


        Status status = target("/entities/new")
                .request()
                .post(Entity.json(dataEntity), Status.class);

        // assertEquals("Should return status 200", 200, response.getStatus());
        assertTrue("Should return a success status", status.isSuccess());
    }
}
