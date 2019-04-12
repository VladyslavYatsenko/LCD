package com.company.yatsenko.LCD.second.variant.factory.impl;

import com.company.yatsenko.LCD.second.variant.factory.Representation;

public class Zero implements Representation {

    @Override
    public String representFirstString() {
       return "._.";
    }

    @Override
    public String representSecondString() {
        return "|.|";
    }
    @Override
    public String representThirdString() {
        return "|_|";
    }
}
