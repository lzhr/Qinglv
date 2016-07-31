package io.github.lzhr.qinglv.bean;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by lz on 2016-07-28.
 */
public class Record extends SugarRecord implements Serializable {
    int bid;
    int cid;
    String checkin;
    String checkout;
    String aim;

   // Customer customer;
   // Bed bed;

    public Record(){}

    public Record(int bid, int cid, String checkin, String checkout, String aim) {
        this.bid = bid;
        this.cid = cid;
        this.checkin = checkin;
        this.checkout = checkout;
        this.aim = aim;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    /*public Customer getCustomer() {
       return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }*/
}
