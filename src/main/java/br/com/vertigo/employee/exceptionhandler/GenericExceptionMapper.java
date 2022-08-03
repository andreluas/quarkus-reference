package br.com.vertigo.employee.exceptionhandler;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import br.com.vertigo.employee.dto.ErrorModel;
import br.com.vertigo.employee.logs.utils.LoggerUtil;

@Provider
public class GenericExceptionMapper extends ExceptionHandler<Exception> {

  @Override
  public Response toResponse(Exception exception) {
    ErrorModel error = new ErrorModel();
    error.setFrom("employee-api");
    error.setMessage(exception.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus("500");

    log.error(
        LoggerUtil.factoryErrorLog(error.getTimestamp(), error.getStatus(), error.getMessage(), error.getFrom()));

    return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
  }

}
