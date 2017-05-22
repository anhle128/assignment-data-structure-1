package com.anhle.models;

import com.anhle.commons.Helper;
import java.io.Serializable;

/**
 * Created by anhle on 5/15/17.
 */
public class Product implements Serializable {

    public String pcode;
    public String pname;
    public int quantity;
    public int saled;
    public double price;

    public Product(){
//        this.pcode = Helper.getCode();
    }
}
