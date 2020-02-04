package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.liquid.Liquid;

public class Coffee extends Liquid {

    private String name;

    public Coffee(String name, int weight, int volume) {
        super(weight, volume);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
