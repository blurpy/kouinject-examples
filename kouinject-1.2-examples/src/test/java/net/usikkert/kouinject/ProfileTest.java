package net.usikkert.kouinject;

import static org.junit.Assert.*;

import java.util.Arrays;

import net.usikkert.kouinject.beans.profile.BackupHandler;
import net.usikkert.kouinject.beans.profile.FileStorage;
import net.usikkert.kouinject.beans.profile.FtpFileStorage;
import net.usikkert.kouinject.beans.profile.TemporaryDirectoryFileStorage;

import org.junit.Test;

/**
 * Test of the profile examples.
 *
 * @author Christian Ihle
 */
public class ProfileTest {

    @Test
    public void productionProfileShouldGiveFtpFileStorage() {
        final Injector injector = new DefaultInjector(Arrays.asList("production"), "net.usikkert.kouinject.beans.profile");

        final BackupHandler backupHandler = injector.getBean(BackupHandler.class);
        assertNotNull(backupHandler);

        final FileStorage fileStorage = backupHandler.getFileStorage();
        assertNotNull(fileStorage);
        assertEquals(FtpFileStorage.class, fileStorage.getClass());
    }

    @Test
    public void developmentProfileShouldGiveTemporaryDirectoryFileStorage() {
        final Injector injector = new DefaultInjector(Arrays.asList("development"), "net.usikkert.kouinject.beans.profile");

        final BackupHandler backupHandler = injector.getBean(BackupHandler.class);
        assertNotNull(backupHandler);

        final FileStorage fileStorage = backupHandler.getFileStorage();
        assertNotNull(fileStorage);
        assertEquals(TemporaryDirectoryFileStorage.class, fileStorage.getClass());
    }
}
