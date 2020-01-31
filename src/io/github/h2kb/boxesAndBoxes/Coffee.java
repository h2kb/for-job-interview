package io.github.h2kb.boxesAndBoxes;

public class Coffee extends Entity {

    public Coffee(String name, int weight, int volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.setLiquid(true);
    }
}
