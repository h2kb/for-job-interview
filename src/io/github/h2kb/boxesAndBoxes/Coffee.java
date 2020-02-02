package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.liquid.Liquid;

public class Coffee extends Liquid {

    public Coffee(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
        this.setLiquid();
    }

    @Override
    public void setLiquid() {
        this.isLiquid = true;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "weight=" + weight +
                ", volume=" + volume +
                '}';
    }
}
