package net.usikkert.kouinject;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.usikkert.kouinject.beans.factory.Calendar;
import net.usikkert.kouinject.beans.factory.Soup;

import org.junit.Test;

/**
 * Test of the factory examples.
 *
 * @author Christian Ihle
 */
public class FactoryTest {

    @Test
    public void dateFactoryShouldCreateCorrectDates() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.factory");

        final Calendar calendar = injector.getBean(Calendar.class);
        assertNotNull(calendar);

        final Date beginningOfTime = calendar.getBeginningOfTime();
        assertTrue(sameDate("01.01.1970", beginningOfTime));

        final Date endOfTime = calendar.getEndOfTime();
        assertTrue(sameDate("21.12.2012", endOfTime));

        final Date garfieldBirthday = calendar.getGarfieldBirthday();
        assertTrue(sameDate("19.06.1978", garfieldBirthday));
    }

    @Test
    public void soupFactoryShouldCreateSingletonTomatoSoup() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.factory");

        final Soup soup = injector.getBean(Soup.class, "tomato");
        assertNotNull(soup);
        assertEquals("tomato", soup.getType());

        final Soup newSoup  = injector.getBean(Soup.class);
        assertSame(soup, newSoup);
    }

    private boolean sameDate(final String expectedDate, final Date actualDate) {
        assertNotNull(actualDate);

        final SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        return format.format(actualDate).equals(expectedDate);
    }
}
