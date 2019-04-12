package com.lls.cherry.exception;

import java.io.IOException;

/************************************
 * FrameworkIOException
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class FrameworkIOException extends IOException {

  private static final long serialVersionUID = -592938332212741L;

  public FrameworkIOException() {
  }

  public FrameworkIOException(String message) {
    super(message);
  }

  public FrameworkIOException(String message, Throwable cause) {
    super(message, cause);
  }

  public FrameworkIOException(Throwable cause) {
    super(cause);
  }


}
