package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public boolean add(int i) {
       boolean flag = false;
       int n = list.size();
        list.add(i);
        if(list.size()>n)
        flag =true;
        else flag=false;
        return flag;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> otherList = new ArrayList<>();

        for(Integer i : list) {
            if(!otherList.contains(i))
                otherList.add(i);
        }
        return otherList;
    }

    public String join() {
       List<String> listJoin = new ArrayList<>();

        String joined3 = String.join(",", listJoin);

        return joined3;
    }

    public Integer mostCommon() {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Integer mostCommon=0;
        for (Integer i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            mostCommon=val.getKey() + val.getValue();
        }

        return mostCommon;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
