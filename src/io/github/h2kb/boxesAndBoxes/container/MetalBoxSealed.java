package io.github.h2kb.boxesAndBoxes.container;

import io.github.h2kb.boxesAndBoxes.container.common.ParallelepipedContainer;

public class MetalBoxSealed extends ParallelepipedContainer {

    public MetalBoxSealed(String name, int length, int width, int height, int maxWeight, boolean sealed) {
        this.setName(name);
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
        this.setVolume(length * width * height);
        this.setMaxWeight(maxWeight);
        this.setSealed(true);
    }
}
