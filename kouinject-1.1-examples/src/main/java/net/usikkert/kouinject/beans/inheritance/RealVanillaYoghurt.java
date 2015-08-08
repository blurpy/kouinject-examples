package net.usikkert.kouinject.beans.inheritance;

import javax.inject.Named;

import net.usikkert.kouinject.annotation.Component;

@Named("real")
@Component
public class RealVanillaYoghurt extends VanillaYoghurt {

    public RealVanillaYoghurt() {
        System.out.println("RealVanillaYoghurt: " + this);
    }
}
