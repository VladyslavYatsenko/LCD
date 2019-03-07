package com.company.yatsenko.LCD.second.variant.factory.impl;

import com.company.yatsenko.LCD.second.variant.factory.Representation;

public class One implements Representation {
    @Override
    public void representFirstString() {
        System.out.print("...");
    }

    @Override
    public void representSecondString() {
        System.out.print("..|");
    }

    @Override
    public void representThirdString() {
        System.out.print("..|");
    }
}
