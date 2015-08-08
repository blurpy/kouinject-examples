package net.usikkert.kouinject;

import static org.junit.Assert.*;

import javax.inject.Provider;

import net.usikkert.kouinject.beans.array.Cookie;
import net.usikkert.kouinject.beans.array.CookieMonster;
import net.usikkert.kouinject.beans.generics.Box;
import net.usikkert.kouinject.generics.TypeLiteral;

import org.junit.Test;

/**
 * Test of using array beans.
 *
 * @author Christian Ihle
 */
public class ArrayTest {

    @Test
    public void shouldSupportInjectionOfArrays() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.array");

        final CookieMonster cookieMonster = injector.getBean(CookieMonster.class);
        assertNotNull(cookieMonster);

        final Cookie[] cookies = cookieMonster.getCookies();
        verifyCookies(cookies);
    }

    @Test
    public void shouldSupportInjectionOfArraysIntoProvider() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.array");

        final CookieMonster cookieMonster = injector.getBean(CookieMonster.class);
        assertNotNull(cookieMonster);

        final Provider<Cookie[]> cookieProvider = cookieMonster.getCookieProvider();
        assertNotNull(cookieProvider);

        final Cookie[] cookies = cookieProvider.get();
        verifyCookies(cookies);
    }

    @Test
    public void shouldSupportInjectingAGenericClassWithAnArrayAsParameter() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.array");

        final CookieMonster cookieMonster = injector.getBean(CookieMonster.class);
        assertNotNull(cookieMonster);

        final Box<Cookie[]> boxOfCookies = cookieMonster.getBoxOfCookies();
        assertNotNull(boxOfCookies);

        final Cookie[] cookies = boxOfCookies.getContent();
        verifyCookies(cookies);
    }

    @Test
    public void shouldSupportInjectingAGenericClassWithAnArrayAsParameterIntoProvider() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.array");

        final CookieMonster cookieMonster = injector.getBean(CookieMonster.class);
        assertNotNull(cookieMonster);

        final Provider<Box<Cookie[]>> boxOfCookiesProvider = cookieMonster.getBoxOfCookiesProvider();
        assertNotNull(boxOfCookiesProvider);

        final Box<Cookie[]> boxOfCookies = boxOfCookiesProvider.get();
        assertNotNull(boxOfCookies);

        final Cookie[] cookies = boxOfCookies.getContent();
        verifyCookies(cookies);
    }

    @Test
    public void shouldSupportGettingAnArrayFromTheInjector() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.array");

        final Cookie[] cookies = injector.getBean(Cookie[].class);
        verifyCookies(cookies);
    }

    @Test
    public void shouldSupportGettingAGenericClassWithAnArrayAsParameterFromTheInjector() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.array");

        final Box<Cookie[]> boxOfCookies = injector.getBean(new TypeLiteral<Box<Cookie[]>>() {});
        assertNotNull(boxOfCookies);

        final Cookie[] cookies = boxOfCookies.getContent();
        verifyCookies(cookies);
    }

    private void verifyCookies(final Cookie[] cookies) {
        assertNotNull(cookies);
        assertEquals(2, cookies.length);

        assertEquals("Chocolate", cookies[0].getType());
        assertEquals("Vanilla", cookies[1].getType());
    }
}
