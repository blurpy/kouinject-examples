package net.usikkert.kouinject.beans.generics;

import net.usikkert.kouinject.annotation.Component;

/**
 * A plastic box for an apple.
 *
 * @author Christian Ihle
 */
@Component
public class AppleBox extends PlasticBox<Apple> {

    public AppleBox() {
        super(new Apple());
        System.out.println("AppleBox");
    }
}
