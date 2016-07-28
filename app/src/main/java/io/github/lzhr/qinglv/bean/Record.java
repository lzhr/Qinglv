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

    public Record(){}


}
