package net.usikkert.kouinject;

import static org.junit.Assert.*;

import java.util.Collection;

import net.usikkert.kouinject.beans.collection.CasualRadioListener;
import net.usikkert.kouinject.beans.collection.EagerRadioListener;
import net.usikkert.kouinject.beans.collection.Radio;
import net.usikkert.kouinject.beans.collection.RadioListener;
import net.usikkert.kouinject.beans.collection.RegularRadioListener;

import org.junit.Test;

public class CollectionTest {

    @Test
    public void shouldGetAllListeners() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.collection");

        final Radio radio = injector.getBean(Radio.class);
        assertNotNull(radio);

        final Collection<RadioListener> radioListeners = radio.getRadioListeners();
        assertNotNull(radioListeners);
        assertEquals(3, radioListeners.size());

        assertTrue(containsInstanceOf(CasualRadioListener.class, radioListeners));
        assertTrue(containsInstanceOf(RegularRadioListener.class, radioListeners));
        assertTrue(containsInstanceOf(EagerRadioListener.class, radioListeners));
    }

    private boolean containsInstanceOf(final Class<?> aClass, final Collection<RadioListener> radioListeners) {
        for (final RadioListener radioListener : radioListeners) {
            if (radioListener.getClass().equals(aClass)) {
                return true;
            }
        }

        return false;
    }
}
