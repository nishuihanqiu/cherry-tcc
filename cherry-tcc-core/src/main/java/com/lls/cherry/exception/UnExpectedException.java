package com.lls.cherry.exception;

/************************************
 * UnExpectedException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class UnExpectedException extends FrameworkException {

  private static final long serialVersionUID = -514856123918794206L;

  public UnExpectedException() {
  }

  public UnExpectedException(String message) {
    super(message);
  }

  public UnExpectedException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnExpectedException(Throwable cause) {
    super(cause);
  }


}
