package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.common.Entity;
import io.github.h2kb.boxesAndBoxes.tank.CylinderTank;
import io.github.h2kb.boxesAndBoxes.tank.IHasLid;
import io.github.h2kb.boxesAndBoxes.tank.ISealed;

public class GlassJar extends CylinderTank implements ISealed, IHasLid {

    private boolean isLidClosed = true;

    public GlassJar(int weight, int liftCapacity, int height, int radius) {
        super(weight, liftCapacity, height, radius);
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
    protected boolean doPutIn(Entity content) {
        if (isLidClosed) {
            openLid();
        }

        contents.push(content);
        closeLid();

        return true;
    }
}
