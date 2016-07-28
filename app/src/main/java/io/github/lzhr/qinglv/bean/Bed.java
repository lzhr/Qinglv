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

    public Bed(){}


}
