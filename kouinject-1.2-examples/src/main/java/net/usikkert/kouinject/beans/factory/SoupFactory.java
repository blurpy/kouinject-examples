package net.usikkert.kouinject.beans.factory;

import javax.inject.Named;
import javax.inject.Singleton;

import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Produces;

/**
 * A very simple factory for creating a singleton tomato soup bean.
 *
 * @author Christian Ihle
 */
@Component
public class SoupFactory {

    public SoupFactory() {
        System.out.println("SoupFactory");
    }

    @Produces @Singleton @Named("tomato")
    public Soup createTomatoSoup() {
        return new Soup("tomato");
    }
}
