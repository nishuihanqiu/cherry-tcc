package com.lls.cherry.enums;

/************************************
 * StateEnum
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public enum StateEnum {

  TRYING(1),
  CONFIRMING(2),
  CANCELLING(3);

  private int state;

  StateEnum(int state) {
    this.state = state;
  }

  public int getState() {
    return state;
  }

  public static StateEnum valueOf(int state) {
    switch (state) {
      case 1:
        return TRYING;
      case 2:
        return CONFIRMING;
      case 3:
        return CANCELLING;
    }

    return null;
  }


}
