package com.company.yatsenko.LCD.second.variant.factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumericParser numericParser=new NumericParser();
        NumericFactory numericFactory=new NumericFactory();
        List<Integer> numericsList=numericParser.digitsInNumber(0123456);
        System.out.println(numericsList);
        for(int i=0;i<numericsList.size();i++){
           numericFactory.createRepresentation(numericsList.get(i)).representFirstString();
           System.out.print(" ");

        }
        System.out.println();
        for(int i=0;i<numericsList.size();i++){
            numericFactory.createRepresentation(numericsList.get(i)).representSecondString();
            System.out.print(" ");

        }
        System.out.println();
        for(int i=0;i<numericsList.size();i++){
            numericFactory.createRepresentation(numericsList.get(i)).representThirdString();
            System.out.print(" ");

        }

//        for(int i=0;i<numericsList.size();i++){
//            numericFactory.createRepresentation(numericsList.get(i)).representFirstString();
//            System.out.print(" ");
//            System.out.println();
//            for(int j=0;j<i;j++){
//                numericFactory.createRepresentation(numericsList.get(i)).representSecondString();
//                System.out.print(" ");
//                System.out.println();
//                for(int k=0;k<j;k++){
//                    numericFactory.createRepresentation(numericsList.get(i)).representThirdString();
//                    System.out.print(" ");
//                }
//            }
//        }
    }
}
