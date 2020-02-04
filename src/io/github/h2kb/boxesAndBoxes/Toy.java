package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.common.Entity;

public class Toy extends Entity {

    private String name;

    public Toy(String name, int weight, int volume) {
        super(weight, volume);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
