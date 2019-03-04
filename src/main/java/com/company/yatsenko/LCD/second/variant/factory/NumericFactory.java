package com.company.yatsenko.LCD.second.variant.factory;

import com.company.yatsenko.LCD.second.variant.factory.impl.*;

public class NumericFactory {

    public Represntation createRepresentation(int number) {
        if (number == 0) {
            return new Zero();
        } else if (number == 1) {
            return new One();
        } else if (number == 2) {
            return new Two();
        } else if (number == 3) {
            return new Three();
        } else if (number == 4) {
            return new Four();
        } else if (number == 5) {
            return new Five();
        } else if (number == 6) {
            return new Six();
        } else if (number == 7) {
            return new Seven();
        } else if (number == 8) {
            return new Eight();
        } else {
            return new Nine();
        }
    }
}
