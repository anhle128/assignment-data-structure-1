package com.anhle.models;

import com.anhle.commons.Helper;
import com.anhle.enums.CompareResult;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by anhle on 5/15/17.
 */
public class Customer implements Comparable<Object>{

    public String ccode;
    public String cname;
    public String phone;

    public Customer(String ccode) {
        this.ccode = ccode;
    }
    
    public Customer(){
//        this.ccode = Helper.getCode();
    }

    @Override
    public int compareTo(Object other) {
         return Helper.compareString(this.ccode, ((Customer)other).ccode);
    }
}
