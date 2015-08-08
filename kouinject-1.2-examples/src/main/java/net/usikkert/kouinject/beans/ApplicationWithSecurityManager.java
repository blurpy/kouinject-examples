package net.usikkert.kouinject.beans;

import java.util.Arrays;

import net.usikkert.kouinject.DefaultInjector;
import net.usikkert.kouinject.Injector;

/**
 * Example of running the injector with a security manager.
 *
 * <p>The policy file assumes that KouInject is located in the default Maven repository location.</p>
 *
 * @author Christian Ihle
 */
public class ApplicationWithSecurityManager {

    public static void main(final String[] args) {
        System.setProperty("java.security.policy", "src/main/resources/kouinject.policy");
        System.setSecurityManager(new SecurityManager());

        final Injector injector = new DefaultInjector(Arrays.asList("production"), "net.usikkert.kouinject.beans");

        injector.getBeans(Object.class, "any");
    }
}
