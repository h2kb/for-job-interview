package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.container.GlassJar;
import io.github.h2kb.boxesAndBoxes.container.PaperBox;
import io.github.h2kb.boxesAndBoxes.filler.Toy;
import io.github.h2kb.boxesAndBoxes.filler.Water;

public class Test {

    public static void main(String[] args) throws Exception {
        Water water = new Water("water", 5, 5);
        Water water2 = new Water("water", 790, 790);
        Toy toyCar = new Toy("toyCar", 3, 10);

        PaperBox paperBox = new PaperBox("Paper0", 10, 10, 15, 50, false);
        System.out.println(paperBox.getVolume());
        paperBox.addContent(toyCar);
//        paperBox.addContent(water);
        System.out.println(paperBox.getContent());
        System.out.println(paperBox.getVolume());

        GlassJar glassJar = new GlassJar("Banka", 10, 5, 20,true);
        System.out.println(glassJar.getVolume());
        glassJar.addContent(water2);
        System.out.println(glassJar.getContent());
        System.out.println(glassJar.getVolume());
    }
}
