package io.github.h2kb.boxesAndBoxes;

public class Water extends Entity {

    public Water(String name, int weight, int volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.setLiquid(true);
    }
}
