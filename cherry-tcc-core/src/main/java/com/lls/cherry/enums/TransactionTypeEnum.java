package com.lls.cherry.enums;

/************************************
 * TransactionTypeEnum
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public enum TransactionTypeEnum {

  ;

  private int category;

  TransactionTypeEnum(int category) {
    this.category = category;
  }

  public int getCategory() {
    return category;
  }


}
