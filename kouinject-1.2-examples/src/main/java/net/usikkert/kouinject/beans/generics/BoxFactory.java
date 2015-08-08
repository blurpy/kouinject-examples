package net.usikkert.kouinject.beans.generics;

import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Produces;

/**
 * A factory for creating generic Box beans.
 *
 * @author Christian Ihle
 */
@Component
public class BoxFactory {

    public BoxFactory() {
        System.out.println("BoxFactory");
    }

    @Produces
    public PlasticBox<Orange> createBoxOfOrange() {
        return new PlasticBox<Orange>(new Orange());
    }
}
