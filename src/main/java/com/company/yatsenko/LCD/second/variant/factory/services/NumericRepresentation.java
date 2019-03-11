package com.company.yatsenko.LCD.second.variant.factory.services;

import java.util.List;

public class NumericRepresentation {
    private RepresentationFactory representationFactory;
    private NumericParser numericParser;

    public NumericRepresentation(RepresentationFactory numericFactory, NumericParser numericParser) {
        this.representationFactory = numericFactory;
        this.numericParser = numericParser;
    }

    public void representNumeric(int number) {
        List<Integer> numericsList = numericParser.digitsInNumber(number);
        System.out.println(numericsList);

        for (int i = 0; i < numericsList.size(); i++) {
            representationFactory.createRepresentation(numericsList.get(i)).representFirstString();
            System.out.print(" ");

        }
        System.out.println();
        for (int i = 0; i < numericsList.size(); i++) {
            representationFactory.createRepresentation(numericsList.get(i)).representSecondString();
            System.out.print(" ");

        }
        System.out.println();
        for (int i = 0; i < numericsList.size(); i++) {
            representationFactory.createRepresentation(numericsList.get(i)).representThirdString();
            System.out.print(" ");

        }

    }
}
