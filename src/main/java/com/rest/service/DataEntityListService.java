package com.rest.service;

import com.rest.generated.DataEntities;
import com.rest.generated.DataEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by T on 17/05/2016.
 */
@Path("/entities/list")
public class DataEntityListService {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public DataEntities getDataEntityList() {

        DataEntity dataEntityOne = new DataEntity();
        DataEntity dataEntityTwo = new DataEntity();
        DataEntity dataEntityThree = new DataEntity();

        dataEntityOne.setId("1");
        dataEntityOne.setName("One");
        dataEntityOne.setDescription("First");
        dataEntityOne.setQuantity(1);

        dataEntityTwo.setId("2");
        dataEntityTwo.setName("Two");
        dataEntityTwo.setDescription("Second");
        dataEntityTwo.setQuantity(2);

        dataEntityThree.setId("3");
        dataEntityThree.setName("Three");
        dataEntityThree.setDescription("Third");
        dataEntityThree.setQuantity(3);

        DataEntities dataEntities = new DataEntities();

        dataEntities.getEntities().add(dataEntityOne);
        dataEntities.getEntities().add(dataEntityTwo);
        dataEntities.getEntities().add(dataEntityThree);

        return dataEntities;
    }
}
