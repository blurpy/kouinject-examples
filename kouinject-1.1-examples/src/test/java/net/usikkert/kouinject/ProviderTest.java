package net.usikkert.kouinject;

import static org.junit.Assert.*;

import javax.inject.Provider;

import net.usikkert.kouinject.beans.provider.Cucumber;
import net.usikkert.kouinject.beans.provider.Salad;

import org.junit.Test;

public class ProviderTest {

    @Test
    public void shouldGetInstanceFromProvider() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.provider");

        final Salad salad = injector.getBean(Salad.class);
        assertNotNull(salad);

        final Provider<Cucumber> cucumberProvider = salad.getCucumberProvider();
        assertNotNull(cucumberProvider);

        final Cucumber cucumber = cucumberProvider.get();
        assertNotNull(cucumber);
    }
}
