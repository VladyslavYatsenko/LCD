package com.company.yatsenko.LCD.second.variant.factory.impl;

import com.company.yatsenko.LCD.second.variant.factory.Representation;

public class Three implements Representation {
    @Override
    public void representFirstString() {
        System.out.print("._.");
    }

    @Override
    public void representSecondString() {
        System.out.print("._|");
    }

    @Override
    public void representThirdString() {
        System.out.print("._|");
    }
}
