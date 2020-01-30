package io.github.h2kb.boxesAndBoxes.container.common;

import io.github.h2kb.boxesAndBoxes.filler.common.Filler;

import java.util.ArrayList;

public abstract class Container {

    private String name;

    private ArrayList<Filler> content = new ArrayList<Filler>();

    private int volume;

    private boolean sealed;

    private int maxWeight;

    protected void setName(String name) {
        this.name = name;
    }

    public void addContent(Filler content) throws Exception {
        if (content.isLiquid() && !isSealed()) {
            throw new Exception("Not sealed");
        }

        if (content.getVolume() <= volume && content.getWeight() <= maxWeight) {
            this.content.add(content);
            volume -= content.getVolume();
        } else {
            throw new Exception("Is full");
        }
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected void setSealed(boolean sealed) {
        this.sealed = sealed;
    }

    protected void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content.toString();
    }

    public int getVolume() {
        return volume;
    }

    public boolean isSealed() {
        return sealed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
