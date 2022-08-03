package br.com.vertigo.employee.exceptionhandler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.vertigo.employee.dto.ErrorModel;

public abstract class ExceptionHandler<T extends Throwable> implements ExceptionMapper<T> {
  protected final Logger log = LoggerFactory.getLogger(super.getClass());

  public Response createResponseError(Status status, ErrorModel entity) {
    return Response.status(status).entity(entity).build();
  }
}

class ResponseError {
  @JsonProperty("error-message")
  private String message;

  public ResponseError(String message) {
    super();
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}