package net.usikkert.kouinject.beans.profile;

import javax.inject.Inject;

import net.usikkert.kouinject.annotation.Component;

/**
 * A bean injecting a different implementation of file storage based on the currently active profile.
 *
 * @author Christian Ihle
 */
@Component
public class BackupHandler {

    @Inject
    private FileStorage fileStorage;

    public BackupHandler() {
        System.out.println("BackupHandler");
    }

    public FileStorage getFileStorage() {
        return fileStorage;
    }
}
