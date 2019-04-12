package com.lls.cherry;

import com.lls.cherry.enums.StateEnum;
import com.lls.cherry.exception.InvalidTransactionException;
import com.lls.cherry.exception.NotSupportException;
import com.lls.cherry.exception.RollbackException;
import com.lls.cherry.exception.UnExpectedException;

/************************************
 * TransactionManager
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public interface TransactionManager {

  void begin() throws NotSupportException, UnExpectedException;

  void commit() throws RollbackException, SecurityException, IllegalStateException, UnExpectedException;

  void commit(boolean async) throws RollbackException, SecurityException, IllegalStateException, UnExpectedException;

  void rollback() throws SecurityException, IllegalStateException, UnExpectedException;

  void rollback(boolean async) throws SecurityException, IllegalStateException, UnExpectedException;

  void setTransactionTimeout(int seconds) throws UnExpectedException;

  Transaction suspend() throws UnExpectedException;

  void resume(Transaction transaction) throws InvalidTransactionException, IllegalStateException, UnExpectedException;

  StateEnum getTransactionState() throws UnExpectedException;

  Transaction getTransaction();


}
