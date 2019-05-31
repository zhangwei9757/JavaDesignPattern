package com.zhangwei9757.top.objectactionmode.strategy;

/**
 * Created by zw on 2019-5-30
 * <p>
 */
public class MyTour {

    private TripMode tm;

    public TripMode getTm() {
        return tm;
    }

    public void setTm(TripMode tm) {
        this.tm = tm;
    }

    public void goOut() {
        tm.gotOut();
    }
}
