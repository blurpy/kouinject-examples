package net.usikkert.kouinject.beans.generics;

import net.usikkert.kouinject.annotation.Component;

/**
 * An everlasting box filled with chocolate.
 *
 * @author Christian Ihle
 */
@Component
public class ChocolateBox extends EverlastingBox<Chocolate> {

    public ChocolateBox() {
        System.out.println("ChocolateBox");
    }
}
