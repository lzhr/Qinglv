package io.github.lzhr.qinglv.bean;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by lz on 2016-07-28.
 */
public class Bed extends SugarRecord implements Serializable {
    int bid;
    String name;
    String info;
    String station;

   // public List<Record> records;

    public Bed(){}


    public Bed(int bid, String name, String info, String station) {
        this.bid = bid;
        this.name = name;
        this.info = info;
        this.station = station;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

  /*  public List<Record> getRecords() {
        return records;
    }
*/


}
