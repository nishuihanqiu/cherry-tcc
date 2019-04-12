package com.lls.cherry.exception;

/************************************
 * TransactionalException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class TransactionalException extends RuntimeException {

  private static final long serialVersionUID = -2338382218560986417L;

  public TransactionalException() {
  }

  public TransactionalException(String message) {
    super(message);
  }

  public TransactionalException(String message, Throwable cause) {
    super(message, cause);
  }

  public TransactionalException(Throwable cause) {
    super(cause);
  }

}
