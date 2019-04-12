package com.lls.cherry;

import com.lls.cherry.core.TransactionId;
import com.lls.cherry.enums.StateEnum;
import com.lls.cherry.enums.TransactionTypeEnum;

import java.util.Date;

/************************************
 * CherryTransaction
 * @author liliangshan
 * @date 2019-04-12
 ************************************/
public class CherryTransaction {

  private static final long serialVersionUID = -346782938283039284L;

  private TransactionId transactionId;

  private StateEnum state;

  private TransactionTypeEnum transactionType;

  private volatile int retriedCount = 0;

  private Date createdAt = new Date();

  private Date updatedAt = new Date();

  private long version = 1;

//    private

}
