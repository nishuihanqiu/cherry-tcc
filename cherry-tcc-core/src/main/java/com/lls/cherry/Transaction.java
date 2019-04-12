package com.lls.cherry;

import com.lls.cherry.core.TransactionId;
import com.lls.cherry.enums.StateEnum;
import com.lls.cherry.exception.RollbackException;
import com.lls.cherry.exception.UnExpectedException;

import java.util.Date;

/************************************
 * Transaction
 * @author liliangshan
 * @date 2019-04-09
 ************************************/
public interface Transaction {

    TransactionId getTransactionId();

    void commit() throws RollbackException, SecurityException, IllegalStateException, UnExpectedException;

    StateEnum getState();

    void rollback() throws IllegalStateException, UnExpectedException;

    void setState(StateEnum state);

    void setVersion(long version);

    long getVersion();

    Date getCreatedTime();

    Date getUpdatedTime();

    void setUpdatedTime(Date date);

}
