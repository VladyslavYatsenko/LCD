package com.company.yatsenko.LCD.first.variant;

import java.util.*;

public class Representer {

    private final Character[][] representationZero = {{'.', '_', '.'}, {'|', '.', '|'}, {'|', '_', '|'}};
    private final Character[][] representationOne = {{'.', '.', '.'}, {'.', '.', '|'}, {'.', '.', '|'}};
    private final Character[][] representationTwo = {{'.', '_', '.'}, {'.', '_', '|'}, {'|', '_', '.'}};
    private final Character[][] representationThree = {{'.', '_', '.'}, {'.', '_', '|'}, {'.', '_', '|'}};
    private final Character[][] representationFour = {{'.', '.', '.'}, {'|', '_', '|'}, {'.', '.', '|'}};
    private final Character[][] representationFive = {{'.', '_', '.'}, {'|', '_', '.'}, {'.', '_', '|'}};
    private final Character[][] representationSix = {{'.', '_', '.'}, {'|', '_', '.'}, {'|', '_', '|'}};
    private final Character[][] representationSeven = {{'.', '_', '.'}, {'.', '.', '|'}, {'.', '.', '|'}};
    private final Character[][] representationEight = {{'.', '_', '.'}, {'|', '_', '|'}, {'|', '_', '|'}};
    private final Character[][] representationNine = {{'.', '_', '.'}, {'|', '_', '|'}, {'.', '.', '|'}};
    public Map<Integer, Character[][]> representationsPairs = new LinkedHashMap<>();

    public void setRepresentation(int number) {
        List<Integer> numericsList = digitsInNumber(number);
        for (Integer numeric : numericsList) {
            System.out.println(numeric);
            if (numeric == 0) {
                representationsPairs.put(numeric, representationZero);
            } else if (numeric == 1) {
                representationsPairs.put(numeric, representationOne);
            } else if (numeric == 2) {
                representationsPairs.put(numeric, representationTwo);
            } else if (numeric == 3) {
                representationsPairs.put(numeric, representationThree);
            } else if (numeric == 4) {
                representationsPairs.put(numeric, representationFour);
            } else if (numeric == 5) {
                representationsPairs.put(numeric, representationFive);
            } else if (numeric == 6) {
                representationsPairs.put(numeric, representationSix);
            } else if (numeric == 7) {
                representationsPairs.put(numeric, representationSeven);
            } else if (numeric == 8) {
                representationsPairs.put(numeric, representationEight);
            }else if(numeric==9){
                representationsPairs.put(numeric,representationNine);
        }
    }
}

    public void showRepresentation() {
        for (Character[][] characters : representationsPairs.values()) {
            for (int i = 0; i < characters.length; i++) {
                for (int j = 0; j < characters.length; j++) {
                    System.out.print(characters[i][j]);
                }
                System.out.println();
            }
        }
    }

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
