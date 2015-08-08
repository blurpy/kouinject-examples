package net.usikkert.kouinject.beans.profile;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Profile;

/**
 * The "production" profile, that is also a custom @Component.
 *
 * @author Christian Ihle
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Profile
@Component
public @interface Production {

}
