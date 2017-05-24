package com.anhle.models;

import com.anhle.commons.Helper;
import com.anhle.enums.CompareResult;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by anhle on 5/15/17.
 */
public class Ordering implements Comparable<Object> {

    
    public String pcode;
    public String ccode;
    public int quantity;
    public String pro_image_url;

    public Ordering(){
        
    }
    
    public String getCombineCode(){
        return pcode + ccode;
    }

    @Override
    public int compareTo(Object other) {
        Ordering orderOther = (Ordering)other;
        return Helper.compareString(this.getCombineCode(), orderOther.getCombineCode());
    }

}
