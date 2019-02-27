package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        boolean flag = false;
        int len = array.length;
        if(len%2==0)
            flag = true;
        else
            flag = false;

        return flag;
    }


    public Integer[] range(Integer start, Integer stop) {
        int n=0;
        //List<Integer> list = new ArrayList<>();
        if(start<0){
                n=Math.abs(start);
        }
        else n =stop-start+1;

        Integer  array [] =  new Integer[n];

        for(Integer i = start; i<=stop; i++) {
            System.out.print(array[i]+" ");

        }
        //array = list.toArray();

        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
       int sum=0;
        for(int i=0; i<2; i++){
           sum = sum+array[i];
        }

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product=1;
        for(int i=0;i<2; i++){
            product = product*array[i];
        }

        return product;
    }
}
