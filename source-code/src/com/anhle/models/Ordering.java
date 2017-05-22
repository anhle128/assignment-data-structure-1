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

    @Override
    public int compareTo(Object other) {
        
        Ordering orderOther = (Ordering)other;
        
        int pCodeCompareResult = Helper.compareString(this.pcode, orderOther.pcode);
        int cCodeCompareResult = Helper.compareString(this.ccode, orderOther.ccode);
        
       if( pCodeCompareResult== CompareResult.LESS && cCodeCompareResult == CompareResult.LESS){
           return CompareResult.LESS;
           
       }else if(pCodeCompareResult == CompareResult.GREATER && cCodeCompareResult == CompareResult.GREATER){
           return CompareResult.GREATER;
           
       }else if(pCodeCompareResult == CompareResult.GREATER && cCodeCompareResult == CompareResult.LESS){
           return CompareResult.GREATER;
           
       }else if(pCodeCompareResult == CompareResult.LESS && cCodeCompareResult == CompareResult.GREATER){
           return CompareResult.LESS;
           
       }else{
           return CompareResult.EQUAL;
       }
    }

}
