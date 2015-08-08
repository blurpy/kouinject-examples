package net.usikkert.kouinject.beans.factory;

/**
 * A soup bean created by a factory.
 *
 * @author Christian Ihle
 */
public class Soup {

    private String type;

    public Soup(final String type) {
        System.out.println("Soup: " + type);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
