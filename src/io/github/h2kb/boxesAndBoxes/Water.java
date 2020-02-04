package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.liquid.Liquid;

public class Water extends Liquid {

    private String name;

    public Water(String name, int weight, int volume) {
        super(weight, volume);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
