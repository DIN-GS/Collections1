package org.example;

import java.util.*;

public class NumberUtils {

    public static Integer getSum(List<Integer> numbers){
        Integer sum = 0;
        for (Integer number : numbers){
            sum = number + sum;
        }
        return sum;
    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers){
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers){
            if (number % 2 != 0) {
                result.add(number * 2);
            }
        }
        return result;
    }

}
