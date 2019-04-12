package com.lls.cherry.exception;

/************************************
 * CommitException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class CommitException extends FrameworkException {

  private static final long serialVersionUID = -5148569384187942L;

  public CommitException() {
  }

  public CommitException(String message) {
    super(message);
  }

  public CommitException(String message, Throwable cause) {
    super(message, cause);
  }

  public CommitException(Throwable cause) {
    super(cause);
  }


}
