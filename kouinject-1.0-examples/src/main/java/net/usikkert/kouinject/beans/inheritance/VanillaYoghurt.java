package net.usikkert.kouinject.beans.inheritance;

import javax.inject.Named;

import net.usikkert.kouinject.annotation.Component;

@Named("fake")
@Component
public class VanillaYoghurt implements Yoghurt {

    public VanillaYoghurt() {
        System.out.println("VanillaYoghurt: " + this);
    }
}
