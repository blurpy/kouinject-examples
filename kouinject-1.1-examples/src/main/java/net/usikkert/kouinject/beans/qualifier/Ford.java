package net.usikkert.kouinject.beans.qualifier;

import javax.inject.Named;

import net.usikkert.kouinject.annotation.Component;

@Named("Family")
@Component
public class Ford implements Car {

    public Ford() {
        System.out.println("Ford");
    }
}
