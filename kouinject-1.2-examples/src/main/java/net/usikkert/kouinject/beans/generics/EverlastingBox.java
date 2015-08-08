package net.usikkert.kouinject.beans.generics;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * An everlasting box.
 *
 * @param <T> The type of everlasting box this is.
 * @author Christian Ihle
 */
public abstract class EverlastingBox<T> implements Box<T> {

    @Inject
    private Provider<T> contentProvider;

    public T getContent() {
        return contentProvider.get();
    }
}
