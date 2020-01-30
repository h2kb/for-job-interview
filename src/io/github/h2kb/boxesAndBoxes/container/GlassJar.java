package io.github.h2kb.boxesAndBoxes.container;

import io.github.h2kb.boxesAndBoxes.container.common.CylinderContainer;

public class GlassJar extends CylinderContainer {

    public GlassJar(String name, int height, int radius, int maxWeight, boolean sealed) {
        this.setName(name);
        this.setHeight(height);
        this.setRadius(radius);
        this.setVolume((int) (Math.PI * radius * radius * height));
        this.setMaxWeight(maxWeight);
        this.setSealed(true);
    }
}
