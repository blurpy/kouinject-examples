package net.usikkert.kouinject.beans.inheritance;

import javax.inject.Inject;
import javax.inject.Named;

import net.usikkert.kouinject.annotation.Component;

@Component
public class Jens {

    @Inject
    @Named("real")
    private VanillaYoghurt vanillaYoghurt;

    public Jens() {
        System.out.println("Jens");
    }

    public VanillaYoghurt getVanillaYoghurt() {
        return vanillaYoghurt;
    }
}
