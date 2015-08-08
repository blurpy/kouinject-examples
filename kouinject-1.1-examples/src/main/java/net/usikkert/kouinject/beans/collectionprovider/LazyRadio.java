package net.usikkert.kouinject.beans.collectionprovider;

import javax.inject.Inject;

import net.usikkert.kouinject.CollectionProvider;
import net.usikkert.kouinject.annotation.Any;
import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.beans.collection.RadioListener;

@Component
public class LazyRadio {

    @Inject @Any
    private CollectionProvider<RadioListener> radioListenersCollectionProvider;

    public LazyRadio() {
        System.out.println("LazyRadio");
    }

    public CollectionProvider<RadioListener> getRadioListenersCollectionProvider() {
        return radioListenersCollectionProvider;
    }
}
