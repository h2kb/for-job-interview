package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.liquid.Liquid;

public class Water extends Liquid{

    public Water(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
        setLiquid();
    }

    @Override
    public void setLiquid() {
        this.isLiquid = true;
    }

    @Override
    public String toString() {
        return "Water{" +
                "weight=" + weight +
                ", volume=" + volume +
                '}';
    }
}
