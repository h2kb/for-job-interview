package io.github.h2kb.boxesAndBoxes.filler;

import io.github.h2kb.boxesAndBoxes.filler.common.Filler;

public class Toy extends Filler {

    public Toy(String name, Integer volume, Integer weight) {
        this.setName(name);
        this.setVolume(volume);
        this.setWeight(weight);
        this.setLiquid(false);
    }
}
