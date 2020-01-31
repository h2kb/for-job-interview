package io.github.h2kb.boxesAndBoxes;

public class Toy extends Entity {

    public Toy(String name, int weight, int volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.setLiquid(false);
    }
}
