package net.usikkert.kouinject.beans.profile;

import net.usikkert.kouinject.annotation.Component;

/**
 * A bean using the "development" profile.
 *
 * @author Christian Ihle
 */
@Component
@Development
public class TemporaryDirectoryFileStorage implements FileStorage {

    public TemporaryDirectoryFileStorage() {
        System.out.println("TemporaryDirectoryFileStorage");
    }
}
