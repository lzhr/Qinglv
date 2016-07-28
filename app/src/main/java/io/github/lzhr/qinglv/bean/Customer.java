package io.github.lzhr.qinglv.bean;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by lz on 2016-07-28.
 */
public class Customer extends SugarRecord implements Serializable{
    String id;
    String name;
    String sex;
    int tel;
    int station;
    //int cid;

    public Customer(){}

    public Customer(String id, String name, String sex, int tel, int station ){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.tel=tel;
        this.station=station;

    }
}
