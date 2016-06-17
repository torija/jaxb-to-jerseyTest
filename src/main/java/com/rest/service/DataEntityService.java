package com.rest.service;

import com.rest.generated.DataEntity;
import com.rest.generated.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by T on 17/05/2016.
 */
@Path("/entities/new")
public class DataEntityService {

    private final static Logger log = LoggerFactory.getLogger(DataEntityService.class);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Status createDataEntity(DataEntity dataEntity)  {

        log.info("Id : " + dataEntity.getId());
        log.info("Name : " + dataEntity.getName());
        log.info("Description : " + dataEntity.getDescription());
        log.info("Quantity : " + dataEntity.getQuantity());

        // if no errors

        Status status = new Status();
        status.setSuccess(true);

        return status;
    }

}
