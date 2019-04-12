package com.lls.cherry;

import com.lls.cherry.enums.StateEnum;
import com.lls.cherry.exception.InvalidTransactionException;
import com.lls.cherry.exception.NotSupportException;
import com.lls.cherry.exception.RollbackException;
import com.lls.cherry.exception.UnExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/************************************
 * CherryTransactionManager
 * @author liliangshan
 * @date 2019-04-12
 ************************************/
public class CherryTransactionManager implements TransactionManager {

  private static final Logger logger = LoggerFactory.getLogger(CherryTransactionManager.class);

  @Override
  public void begin() throws NotSupportException, UnExpectedException {

  }

  @Override
  public void commit() throws RollbackException, SecurityException, IllegalStateException, UnExpectedException {

  }

  @Override
  public void commit(boolean async) throws RollbackException, SecurityException, IllegalStateException, UnExpectedException {

  }

  @Override
  public void rollback() throws SecurityException, IllegalStateException, UnExpectedException {

  }

  @Override
  public void rollback(boolean async) throws SecurityException, IllegalStateException, UnExpectedException {

  }

  @Override
  public void setTransactionTimeout(int seconds) throws UnExpectedException {

  }

  @Override
  public Transaction suspend() throws UnExpectedException {
    return null;
  }

  @Override
  public void resume(Transaction transaction) throws InvalidTransactionException, IllegalStateException, UnExpectedException {

  }

  @Override
  public StateEnum getTransactionState() throws UnExpectedException {
    return null;
  }

  @Override
  public Transaction getTransaction() {
    return null;
  }

}
