package br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions;

public class BadRequestException extends RuntimeException {

  public BadRequestException(String msg) {
    super(msg);
  }
}
