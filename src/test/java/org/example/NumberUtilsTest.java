package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    private static List<Integer> numbers = new ArrayList<>();

    @BeforeAll
    public static void initialize(){
        numbers.add(12);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
    }

    @Test
    void getSum() {
        assertEquals(31, NumberUtils.getSum(numbers));
    }

    @Test
    void multiplyOddNumber() {
        List<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(5);
        oddNumbers.add(1);
        oddNumbers.add(3);
        assertEquals(oddNumbers, NumberUtils.multiplyOddNumber(numbers));
    }
}