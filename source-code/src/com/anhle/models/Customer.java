package com.anhle.models;

import com.anhle.commons.Helper;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by anhle on 5/15/17.
 */
public class Customer implements Serializable {

    public String ccode;
    public String cname;
    public String phone;

    public Customer(String ccode, String cname, String phone) {
        this.ccode = ccode;
        this.cname = cname;
        this.phone = phone;
    }
    
    public Customer(){
//        this.ccode = Helper.getCode();
    }
}
