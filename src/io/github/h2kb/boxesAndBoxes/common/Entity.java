package io.github.h2kb.boxesAndBoxes.common;

public abstract class Entity {

    private final int weight;

    private final int volume;

    public Entity(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }
}
