package io.github.h2kb.boxesAndBoxes.filler.common;

public abstract class Filler {

    private String name;

    private int volume;

    private int weight;

    private boolean isLiquid;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLiquid(boolean liquid) {
        isLiquid = liquid;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isLiquid() {
        return isLiquid;
    }

    @Override
    public String toString() {
        return "Filler{" +
                "name='" + name + '\'' +
                '}';
    }
}
