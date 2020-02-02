package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.common.Entity;
import io.github.h2kb.boxesAndBoxes.tank.IHasLid;
import io.github.h2kb.boxesAndBoxes.tank.ISealed;
import io.github.h2kb.boxesAndBoxes.tank.ParallelepipedTank;

import java.util.ArrayList;

public class PaperBox extends ParallelepipedTank implements ISealed, IHasLid {

    private boolean isLidClosed = true;
    private ArrayList<Entity> contents = new ArrayList<Entity>();

    public PaperBox(int weight, int volume, int liftCapacity, int length, int width, int height) {
        super(weight, volume, liftCapacity, length, width, height);
    }

    @Override
    public boolean openLid() {
        isLidClosed = false;
        return isLidClosed;
    }

    @Override
    public boolean closeLid() {
        isLidClosed = true;
        return isLidClosed;
    }

    @Override
    protected void putIn(Entity content) {
        if (isLidClosed) {
            openLid();
        }

        contents.add(content);
        closeLid();
    }
}
