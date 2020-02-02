package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.container.ContainerCylinder;

public class GlassJar extends ContainerCylinder {

    public GlassJar(int height, int radius, int weight, int liftCapacity) {
        this.setHeight(height);
        this.setRadius(radius);
        this.setWeight(weight);
        this.setVolumeCapacity((int) (Math.PI * radius * radius * height));
        this.setLiftCapacity(liftCapacity);
        this.setSealed(true);
    }
}
