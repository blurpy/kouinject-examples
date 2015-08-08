package net.usikkert.kouinject.beans.profile;

/**
 * A bean using the "production" profile, and a custom @Component.
 *
 * @author Christian Ihle
 */
@Production
public class FtpFileStorage implements FileStorage {

    public FtpFileStorage() {
        System.out.println("FtpFileStorage");
    }
}
