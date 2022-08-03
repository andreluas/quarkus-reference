package br.com.vertigo.employee.exceptionhandler.serviceExceptions.handlers;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.http.client.methods.HttpPatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.vertigo.employee.dto.ErrorModel;
import br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions.InternalServerErrorException;
import br.com.vertigo.employee.logs.utils.LoggerUtil;

@Provider
public class InternalServerErrorExceptionHandler
    implements ExceptionMapper<InternalServerErrorException> {
  protected final Logger log = LoggerFactory.getLogger(super.getClass());
  HttpPatch teste = new HttpPatch();

  @Override
  public Response toResponse(InternalServerErrorException exception) {
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
