package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[]array3 = new Integer[array1.length+array2.length];
        int count =0;
        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            count++;
        }
        for(int j = 0; j < array2.length;j++) {
            array3[count++] = array2[j];
        }
        for(int i = 0;i < array3.length;i++)
            System.out.print(array3[i]+" ");
        return array3;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int i;
        Integer  temp;
        temp = array[0];
        for (i= 0; i < array.length - 1; i++)
            array[i] = array[i + 1];
        array[i] = temp;
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        int n = array1.length;
        int a2 = array2.length;
        Integer numberOfOccurences = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i].equals(valueToEvaluate)) {
                numberOfOccurences = numberOfOccurences + 1;

            }

        }
        for (int i = 0; i < a2; i++) {
            if (array2[i].equals(valueToEvaluate)) {
                count = count + 1;
            }
        }
            numberOfOccurences=numberOfOccurences+count;
            return numberOfOccurences;

        }

    public Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        Integer popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
