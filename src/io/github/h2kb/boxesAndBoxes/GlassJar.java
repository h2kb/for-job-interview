package io.github.h2kb.boxesAndBoxes;

public class GlassJar extends CylinderContainer {

    public GlassJar(String name, int height, int radius, int weight, int liftCapacity) {
        this.setName(name);
        this.setHeight(height);
        this.setRadius(radius);
        this.setWeight(weight);
        this.setVolumeCapacity((int) (Math.PI * radius * radius * height));
        this.setLiftCapacity(liftCapacity);
        this.setSealed(true);
    }
}
