package io.github.h2kb.boxesAndBoxes.liquid;

import io.github.h2kb.boxesAndBoxes.common.Entity;

public abstract class Liquid extends Entity implements ILiquid {

    public Liquid(int weight, int volume) {
        super(weight, volume);
    }
}
