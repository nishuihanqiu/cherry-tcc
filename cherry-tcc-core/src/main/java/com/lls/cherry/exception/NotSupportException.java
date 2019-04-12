package com.lls.cherry.exception;

/************************************
 * NotSupportException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class NotSupportException extends FrameworkException {

  private static final long serialVersionUID = -9238388232277741L;

  public NotSupportException() {
  }

  public NotSupportException(String message) {
    super(message);
  }

  public NotSupportException(String message, Throwable cause) {
    super(message, cause);
  }

  public NotSupportException(Throwable cause) {
    super(cause);
  }


}
