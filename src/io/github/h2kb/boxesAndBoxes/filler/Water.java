package io.github.h2kb.boxesAndBoxes.filler;

import io.github.h2kb.boxesAndBoxes.filler.common.Filler;

public class Water extends Filler {

    public Water(String name, Integer volume, Integer weight) {
        this.setName(name);
        this.setVolume(volume);
        this.setWeight(weight);
        this.setLiquid(true);
    }
}
