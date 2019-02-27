package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Router {
   protected List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
   protected Map<String, Object> map = new HashMap<String, Object>();

    public void add(String path, String controller) {

         map.put(path, controller);
        list.add(map);
    }

    public Integer size() {

       return map.size();
    }

    public String getController(String path) {
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
        map.remove(path);
    }
}
