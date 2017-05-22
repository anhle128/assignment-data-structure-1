package com.anhle.models;

import com.anhle.commons.Helper;
import com.anhle.enums.CompareResult;
import java.io.Serializable;

/**
 * Created by anhle on 5/15/17.
 */
public class Product implements Comparable{

    public String pcode;
    public String pname;
    public int quantity;
    public int saled;
    public double price;

    public Product(){
    }
    
        public Product(String pcode){
        this.pcode = pcode;
    }

    @Override
    public int compareTo(Object other) {
        return Helper.compareString(this.pcode, ((Product)other).pcode);
    }


}
