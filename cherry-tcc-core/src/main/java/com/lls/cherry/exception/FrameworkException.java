package com.lls.cherry.exception;

/************************************
 * FrameworkException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class FrameworkException extends Exception {

  private static final long serialVersionUID = -56778334232277741L;

  public FrameworkException() {
  }

  public FrameworkException(String message) {
    super(message);
  }

  public FrameworkException(String message, Throwable cause) {
    super(message, cause);
  }

  public FrameworkException(Throwable cause) {
    super(cause);
  }

}
