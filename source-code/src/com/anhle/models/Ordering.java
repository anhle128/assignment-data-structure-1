package com.anhle.models;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by anhle on 5/15/17.
 */
public class Ordering implements Serializable {

    
    public String pcode;
    public String ccode;
    public int quantity;
    public String pro_image_url;

    public Ordering(){
        
    }

}
