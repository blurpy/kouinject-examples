package net.usikkert.kouinject.beans.generics;

import net.usikkert.kouinject.annotation.Component;

/**
 * A chocolate bean.
 *
 * @author Christian Ihle
 */
@Component
public class Chocolate {

    public Chocolate() {
        System.out.println("Chocolate");
    }
}
