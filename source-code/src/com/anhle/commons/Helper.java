/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhle.commons;

import com.anhle.models.Customer;
import com.anhle.models.Product;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author apple
 */
public class Helper {
    
    private static char[] templChars = {'a','b','c','d','e','f','g','h','i','j',
               'k','l','m','n','o','p','q','r','s','t',
               'u','v','w','x','y','z','0','1','2','3',
               '4','5','6','7','8','9'};
    
    public static void shuffleArray(char[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    private static void swap(char[] a, int i, int change) {
        char helper = a[i];
        a[i] = a[change];
        a[change] = helper;
    }
    
    public static String getCode(){
        shuffleArray(templChars);
        char[] arrResult = Arrays.copyOf(templChars, 10);
        String strResult = "";
        for (int i = 0; i < arrResult.length; i++) {
            strResult+= arrResult[i];
        }
        return strResult.toUpperCase();
    }
    
    public static Customer getCustomerByCode(ArrayList<Customer> customers,String code){
        for(Customer cus : customers){
            if(cus.ccode != code) 
                continue;
            
            return cus;
        }
        return null;
    }
    
    public static int getIndexCustomerByCode(ArrayList<Customer> customers,String code){
        int i = -1;
        for(Customer cus : customers){
            i++;
            if(cus.ccode != code)
                continue;
            
            return i;
        }
        return -1;
    }
    
    public static Product getProductByCode(ArrayList<Product> products,String code){
        for(Product prod : products){
            if(prod.pcode != code) 
                continue;
            
            return prod;
        }
        return null;
    }
    
    public static int getIndexProductByCode(ArrayList<Product> products,String code){
        int i = -1;
        for(Product prod : products){
            i++;
            if(prod.pcode != code) 
                continue;
            
            return i;
        }
        return -1;
    }

}
  