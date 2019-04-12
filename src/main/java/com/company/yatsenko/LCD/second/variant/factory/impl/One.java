package com.company.yatsenko.LCD.second.variant.factory.impl;

import com.company.yatsenko.LCD.second.variant.factory.Representation;

public class One implements Representation {
    @Override
    public String representFirstString() {
        return "...";
    }

    @Override
    public String representSecondString() {
        return "..|";
    }

    @Override
    public String representThirdString() {
        return "..|";
    }
}
