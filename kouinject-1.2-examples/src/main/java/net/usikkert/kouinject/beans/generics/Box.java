package net.usikkert.kouinject.beans.generics;

/**
 * Box of anything. A generic interface.
 *
 * @param <T> The type of box this is.
 * @author Christian Ihle
 */
public interface Box<T> {

    T getContent();
}
