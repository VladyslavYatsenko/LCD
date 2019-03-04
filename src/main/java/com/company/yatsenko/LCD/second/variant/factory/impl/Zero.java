package com.company.yatsenko.LCD.second.variant.factory.impl;

public class Zero implements Represntation {

    @Override
    public void representFirstString() {
        System.out.print("._.");
    }

    @Override
    public void representSecondString() {
        System.out.print("|.|");
    }

    @Override
    public void representThirdString() {
        System.out.print("|_|");
    }
}
