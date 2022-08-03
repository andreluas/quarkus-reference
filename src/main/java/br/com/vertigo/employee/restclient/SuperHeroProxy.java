package br.com.vertigo.employee.restclient;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import br.com.vertigo.employee.dto.SuperHeros;

@Path("/heros")
@RegisterRestClient(configKey = "superheros-api")
public interface SuperHeroProxy {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SuperHeros> list();
}
