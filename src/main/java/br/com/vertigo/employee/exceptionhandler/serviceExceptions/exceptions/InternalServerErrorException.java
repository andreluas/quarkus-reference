package br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions;

public class InternalServerErrorException extends RuntimeException {

  public InternalServerErrorException(String msg) {
    super(msg);
  }
}
