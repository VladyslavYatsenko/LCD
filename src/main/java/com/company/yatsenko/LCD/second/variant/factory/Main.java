package com.company.yatsenko.LCD.second.variant.factory;

import com.company.yatsenko.LCD.second.variant.factory.services.NumericFactory;
import com.company.yatsenko.LCD.second.variant.factory.services.NumericParser;
import com.company.yatsenko.LCD.second.variant.factory.services.NumericRepresentation;
import com.company.yatsenko.LCD.second.variant.factory.services.RepresentationFactory;

public class Main {
    public static void main(String[] args) {
        NumericParser numericParser = new NumericParser();
        RepresentationFactory numericFactory = new NumericFactory();
        NumericRepresentation numericRepresentation = new NumericRepresentation(numericFactory, numericParser);
        numericRepresentation.representNumeric(98765432);

    }
}
