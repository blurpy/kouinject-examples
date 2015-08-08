package net.usikkert.kouinject.beans.array;

/**
 * A cookie.
 *
 * @author Christian Ihle
 */
public class Cookie {

    private final String type;

    public Cookie(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
