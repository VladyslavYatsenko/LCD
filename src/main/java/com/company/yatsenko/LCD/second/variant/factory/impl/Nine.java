package com.company.yatsenko.LCD.second.variant.factory.impl;

public class Nine implements Represntation{
    @Override
    public void representFirstString() {
        System.out.print("._.");
    }

    @Override
    public void representSecondString() {
        System.out.print("|_|");
    }

    @Override
    public void representThirdString() {
        System.out.print("..|");
    }
}