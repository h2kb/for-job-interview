package io.github.h2kb.boxesAndBoxes.container;

public abstract class ContainerParallelepiped extends Container {

    private int length;

    private int width;

    private int height;

    protected void setLength(int length) {
        this.length = length;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }
}
