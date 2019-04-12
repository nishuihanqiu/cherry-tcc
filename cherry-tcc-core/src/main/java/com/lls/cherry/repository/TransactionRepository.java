package com.lls.cherry.repository;

import com.lls.cherry.Transaction;
import com.lls.cherry.core.TransactionId;

import java.util.List;

/************************************
 * TransactionRepository
 * @author liliangshan
 * @date 2019-04-12
 ************************************/
public interface TransactionRepository {

  List<Transaction> getTransactions(List<TransactionId> xidList);

  Transaction getTransaction(TransactionId xid);

  boolean create(Transaction transaction);

  boolean update(Transaction transaction);

  boolean delete(Transaction transaction);


}
