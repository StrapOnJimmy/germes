package org.yurovnik.germes.app.rest.service;

import jersey.repackaged.com.google.common.collect.Lists;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Администратор on 06.02.2018.
 */
@Path("cities")
/**
 * {@link CityResource} is REST web-service that handles city-related requests
 * @author Администратор
 *
 */
public class CityResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> findCities(){
        return Lists.newArrayList("Vladivostok","Moscow");
    }
}
