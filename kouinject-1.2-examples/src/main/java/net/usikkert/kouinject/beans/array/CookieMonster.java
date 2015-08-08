package net.usikkert.kouinject.beans.array;

import javax.inject.Inject;
import javax.inject.Provider;

import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.beans.generics.Box;

/**
 * A bean that injects arrays in different ways.
 *
 * @author Christian Ihle
 */
@Component
public class CookieMonster {

    @Inject
    private Cookie[] cookies;

    @Inject
    private Provider<Cookie[]> cookieProvider;

    private final Box<Cookie[]> boxOfCookies;

    private Provider<Box<Cookie[]>> boxOfCookiesProvider;

    @Inject
    public CookieMonster(final Box<Cookie[]> boxOfCookies) {
        System.out.println("CookieMonster");
        this.boxOfCookies = boxOfCookies;
    }

    @Inject
    public void setBoxOfCookiesProvider(final Provider<Box<Cookie[]>> boxOfCookiesProvider) {
        this.boxOfCookiesProvider = boxOfCookiesProvider;
    }

    public Cookie[] getCookies() {
        return cookies;
    }

    public Provider<Cookie[]> getCookieProvider() {
        return cookieProvider;
    }

    public Box<Cookie[]> getBoxOfCookies() {
        return boxOfCookies;
    }

    public Provider<Box<Cookie[]>> getBoxOfCookiesProvider() {
        return boxOfCookiesProvider;
    }
}
