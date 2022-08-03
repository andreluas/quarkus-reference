package br.com.vertigo.employee.api;

import br.com.vertigo.employee.dto.EmployeeCadastravel;
import br.com.vertigo.employee.dto.ObjectEmployee;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/employee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface EmployeeApi {

  @DELETE
  @Path("/{employee_id}")
  @Produces({"application/json"})
  Response employeeEmployeeIdDelete(@PathParam("employee_id") @Max(99999) Integer employeeId);

  @GET
  @Path("/{employee_id}")
  @Produces({"application/json"})
  Response employeeEmployeeIdGet(@PathParam("employee_id") @Max(99999) Integer employeeId);

  @PATCH
  @Path("/{employee_id}")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  Response employeeEmployeeIdPatch(
      @PathParam("employee_id") @Max(99999) Integer employeeId,
      @Valid ObjectEmployee objectEmployee);

  @GET
  @Path("/{employee_id}/summary")
  @Produces({"application/json"})
  Response employeeEmployeeIdSummaryGet(@PathParam("employee_id") @Max(99999) Integer employeeId);

  @GET
  @Produces({"application/json"})
  Response employeeGet();

  @POST
  @Consumes({"application/json"})
  @Produces({"application/json"})
  Response employeePost(@Valid @NotNull EmployeeCadastravel employeeCadastravel);
}
