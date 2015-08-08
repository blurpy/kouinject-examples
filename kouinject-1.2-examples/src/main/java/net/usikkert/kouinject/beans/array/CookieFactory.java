package net.usikkert.kouinject.beans.array;

import javax.inject.Singleton;

import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Produces;
import net.usikkert.kouinject.beans.generics.Box;
import net.usikkert.kouinject.beans.generics.PlasticBox;

/**
 * A factory for creating arrays of cookies.
 *
 * @author Christian Ihle
 */
@Singleton
@Component
public class CookieFactory {

    public CookieFactory() {
        System.out.println("CookieFactory");
    }

    @Produces
    public Cookie[] createCookies() {
        return new Cookie[] {
                new Cookie("Chocolate"),
                new Cookie("Vanilla")
        };
    }

    @Produces
    public Box<Cookie[]> createBoxOfCookies(final Cookie[] cookies) {
        return new PlasticBox<Cookie[]>(cookies);
    }
}
