package net.usikkert.kouinject.beans.generics;

/**
 * Plastic box of anything. A generic implementation.
 *
 * @param <T> The type of plastic box this is.
 * @author Christian Ihle
 */
public class PlasticBox<T> implements Box<T> {

    private final T content;

    public PlasticBox(final T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
