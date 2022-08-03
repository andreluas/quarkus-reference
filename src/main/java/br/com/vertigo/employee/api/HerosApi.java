package br.com.vertigo.employee.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/heros")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface HerosApi {

  @GET
  @Produces({ "application/json" })
  Response herosGet();
}
