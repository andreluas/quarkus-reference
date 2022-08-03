package br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions;

public class NotFoundException extends RuntimeException {

  public NotFoundException(String msg) {
    super(msg);
  }

  public NotFoundException(String msg, Integer id) {
    super(msg + id);
  }
}
