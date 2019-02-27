package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        boolean flag = false;
        if(value>=5)
             flag=true;
        else flag = false;
        return flag;
    }

    public Boolean isLessThan7(Integer value) {
        boolean flag = false;
        if(value<=7)
            flag=true;
        return flag;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        boolean flag = false;
        if((valueToEvaluate>=5)&&(valueToEvaluate<=7))
        flag = true;
        return flag;
    }

    public Boolean startsWith(String string, Character character) {
        boolean flag = false;

        char[] stringToCharArray = string.toCharArray();
        Character c =Character.toLowerCase(stringToCharArray[0]);
        if(c==character)
           flag = true;

         else
             flag = false;
        return flag;
    }
}
