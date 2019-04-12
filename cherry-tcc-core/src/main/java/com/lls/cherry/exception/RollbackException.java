package com.lls.cherry.exception;

/************************************
 * RollbackException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class RollbackException extends FrameworkException {

  private static final long serialVersionUID = -92334455399484839L;

  public RollbackException() {
  }

  public RollbackException(String message) {
    super(message);
  }

  public RollbackException(String message, Throwable cause) {
    super(message, cause);
  }

  public RollbackException(Throwable cause) {
    super(cause);
  }

}
