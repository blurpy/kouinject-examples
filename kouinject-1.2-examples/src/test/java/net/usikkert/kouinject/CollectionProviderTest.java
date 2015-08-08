package net.usikkert.kouinject;

import static org.junit.Assert.*;

import java.util.Collection;

import net.usikkert.kouinject.beans.collection.CasualRadioListener;
import net.usikkert.kouinject.beans.collection.EagerRadioListener;
import net.usikkert.kouinject.beans.collection.RadioListener;
import net.usikkert.kouinject.beans.collection.RegularRadioListener;
import net.usikkert.kouinject.beans.collectionprovider.LazyRadio;

import org.junit.Test;

public class CollectionProviderTest {

    @Test
    public void shouldGetAllListeners() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.collection",
                                                      "net.usikkert.kouinject.beans.collectionprovider");

        final LazyRadio lazyRadio = injector.getBean(LazyRadio.class);
        assertNotNull(lazyRadio);

        final CollectionProvider<RadioListener> radioListenersCollectionProvider = lazyRadio.getRadioListenersCollectionProvider();
        assertNotNull(radioListenersCollectionProvider);

        final Collection<RadioListener> radioListeners = radioListenersCollectionProvider.get();
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
