package br.com.vertigo.employee.api;


import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/consultacep/{cep}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface ConsultacepApi {

  @GET
  @Produces({"application/json"})
  Response consultacepCepGet(@PathParam("cep") @Size(min = 8, max = 9) String cep);
}
