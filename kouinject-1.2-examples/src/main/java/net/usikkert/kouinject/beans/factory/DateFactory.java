package net.usikkert.kouinject.beans.factory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.usikkert.kouinject.annotation.Any;
import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Produces;
import net.usikkert.kouinject.factory.FactoryContext;

/**
 * A factory bean creating {@link java.util.Date} instances using the qualifier of the injection point.
 *
 * @author Christian Ihle
 */
@Component
public class DateFactory {

    public DateFactory() {
        System.out.println("DateFactory");
    }

    @Produces @Any
    public Date createDate(final FactoryContext factoryContext) {
        final String date = factoryContext.getQualifier();
        final SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        try {
            return format.parse(date);
        }

        catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
