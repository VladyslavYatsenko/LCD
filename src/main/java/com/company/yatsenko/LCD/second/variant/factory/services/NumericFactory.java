package com.company.yatsenko.LCD.second.variant.factory.services;

import com.company.yatsenko.LCD.second.variant.factory.Representation;
import com.company.yatsenko.LCD.second.variant.factory.impl.*;

public class NumericFactory implements RepresentationFactory {

    public Representation createRepresentation(int number) {
        Representation representation;
        if (number == 0) {
            representation = new Zero();
        } else if (number == 1) {
            representation = new One();
        } else if (number == 2) {
            representation = new Two();
        } else if (number == 3) {
            representation = new Three();
        } else if (number == 4) {
            representation = new Four();
        } else if (number == 5) {
            representation = new Five();
        } else if (number == 6) {
            representation = new Six();
        } else if (number == 7) {
            representation = new Seven();
        } else if (number == 8) {
            representation = new Eight();
        } else {
            representation = new Nine();
        }
        return representation;
    }
}
