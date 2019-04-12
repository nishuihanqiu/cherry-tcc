package com.lls.cherry.exception;


/************************************
 * InvalidTransactionException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class InvalidTransactionException extends FrameworkIOException {

  private static final long serialVersionUID = -1290444322277741L;

  public InvalidTransactionException() {
  }

  public InvalidTransactionException(String message) {
    super(message);
  }

  public InvalidTransactionException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidTransactionException(Throwable cause) {
    super(cause);
  }


}
