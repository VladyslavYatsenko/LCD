package com.company.yatsenko.LCD.second.variant.factory.impl;

import com.company.yatsenko.LCD.second.variant.factory.Representation;

public class Nine implements Representation {
    @Override
    public String representFirstString() {
        return "._.";
    }

    @Override
    public String representSecondString() {
        return "|_|";
    }

    @Override
    public String representThirdString() {
        return "..|";
    }
}
