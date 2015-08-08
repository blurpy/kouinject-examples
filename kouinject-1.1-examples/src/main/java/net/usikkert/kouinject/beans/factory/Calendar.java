package net.usikkert.kouinject.beans.factory;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import net.usikkert.kouinject.annotation.Component;

/**
 * A bean injecting dates from a factory.
 *
 * @author Christian Ihle
 */
@Component
public class Calendar {

    @Inject @Named("1.1.1970")
    private Date beginningOfTime;

    @Inject @Named("19.06.1978")
    private Date garfieldBirthday;

    @Inject @Named("21.12.2012")
    private Date endOfTime;

    public Calendar() {
        System.out.println("Calendar");
    }

    public Date getBeginningOfTime() {
        return beginningOfTime;
    }

    public Date getGarfieldBirthday() {
        return garfieldBirthday;
    }

    public Date getEndOfTime() {
        return endOfTime;
    }
}
