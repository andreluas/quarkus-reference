package br.com.vertigo.employee.exceptionhandler.serviceExceptions.handlers;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.vertigo.employee.dto.ErrorModel;
import br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions.NotFoundException;
import br.com.vertigo.employee.logs.utils.LoggerUtil;

@Provider
public class NotFoundExceptionHandler implements ExceptionMapper<NotFoundException> {
  protected final Logger log = LoggerFactory.getLogger(super.getClass());

  @Override
  public Response toResponse(NotFoundException exception) {
    ErrorModel error = new ErrorModel();
    error.setFrom("employee-api");
    error.setMessage(exception.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus("404");

    log.error(
        LoggerUtil.factoryErrorLog(error.getTimestamp(), error.getStatus(), error.getMessage(), error.getFrom()));

    return Response.status(Status.NOT_FOUND).entity(error).build();
  }

}