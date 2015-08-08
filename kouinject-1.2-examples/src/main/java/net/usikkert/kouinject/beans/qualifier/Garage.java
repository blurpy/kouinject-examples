package net.usikkert.kouinject.beans.qualifier;

import javax.inject.Inject;
import javax.inject.Named;

import net.usikkert.kouinject.annotation.Component;

@Component
public class Garage {

    @Inject
    @Named("Family")
    private Car familyCar;

    private Car sportyCar;

    public Garage() {
        System.out.println("Garage");
    }

    public Car getFamilyCar() {
        return familyCar;
    }

    @Inject
    public void setSportyCar(@Sporty final Car sportyCar) {
        this.sportyCar = sportyCar;
    }

    public Car getSportyCar() {
        return sportyCar;
    }
}
