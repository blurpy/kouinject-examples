package net.usikkert.kouinject.beans.component;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.usikkert.kouinject.annotation.Component;

/**
 * A custom @Component for model beans.
 *
 * @author Christian Ihle
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface Model {

}
