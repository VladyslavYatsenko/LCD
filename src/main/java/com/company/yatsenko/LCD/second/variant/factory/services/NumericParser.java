package com.company.yatsenko.LCD.second.variant.factory.services;

import java.util.ArrayList;
import java.util.List;

public class NumericParser {
    public List<Integer> digitsInNumber(int number) {
        List<Integer> result = new ArrayList<>();
        String numbers = Integer.toString(number);
        char[] charArray = numbers.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            result.add(c);
        }
        return result;
    }
}
