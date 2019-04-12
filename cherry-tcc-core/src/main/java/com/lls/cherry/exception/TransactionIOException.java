package com.lls.cherry.exception;


/************************************
 * TransactionIOException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class TransactionIOException extends FrameworkIOException {

  private static final long serialVersionUID = -928283285606417L;

  public TransactionIOException() {
  }

  public TransactionIOException(String message) {
    super(message);
  }

  public TransactionIOException(String message, Throwable cause) {
    super(message, cause);
  }

  public TransactionIOException(Throwable cause) {
    super(cause);
  }

}
