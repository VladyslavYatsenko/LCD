package com.company.yatsenko.LCD.second.variant.factory;

import java.util.ArrayList;
import java.util.List;

public class NumericParser {
    public List<Integer> digitsInNumber(int number) {
        List<Integer> result = new ArrayList<>();
        String numerics = Integer.toString(number);
        char[] charArray = numerics.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            result.add(c);
        }
        return result;
    }
}
