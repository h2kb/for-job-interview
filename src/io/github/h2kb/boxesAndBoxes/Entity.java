package io.github.h2kb.boxesAndBoxes;

public abstract class Entity {

    protected String name;

    protected int weight;

    protected int volume;

    protected boolean isLiquid;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLiquid(boolean liquid) {
        isLiquid = liquid;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLiquid() {
        return isLiquid;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                '}';
    }
}
