package io.github.lzhr.qinglv.bean;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by lz on 2016-07-28.
 */

public class Customer extends SugarRecord implements Serializable{
    String cid;
    String name;
    String sex;
    int tel;
    int station;
    //int cid;

    public Customer(){}

    public Customer(String cid, String name, String sex, int tel, int station ){
        this.cid=cid;
        this.name=name;
        this.sex=sex;
        this.tel=tel;
        this.station=station;
    }

    public String getCId() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }
}
