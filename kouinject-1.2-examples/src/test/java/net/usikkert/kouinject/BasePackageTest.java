package net.usikkert.kouinject;

import static org.junit.Assert.*;

import net.usikkert.kouinject.beans.collection.Radio;
import net.usikkert.kouinject.beans.inject.DrinkBean;
import net.usikkert.kouinject.beans.provider.Cucumber;
import net.usikkert.kouinject.beans.scope.SingletonBean;

import org.junit.Test;

public class BasePackageTest {

    @Test
    public void beansFromMultipleBasePackagesShouldBeAvailable() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.scope",
                                                      "net.usikkert.kouinject.beans.provider",
                                                      "net.usikkert.kouinject.beans.collection");

        final SingletonBean singletonBean = injector.getBean(SingletonBean.class);
        assertNotNull(singletonBean);

        final Cucumber cucumber = injector.getBean(Cucumber.class);
        assertNotNull(cucumber);

        final Radio radio = injector.getBean(Radio.class);
        assertNotNull(radio);
    }

    @Test(expected = IllegalArgumentException.class)
    public void beansFromOtherBasePackagesShouldNotBeAvailable() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.scope",
                                                      "net.usikkert.kouinject.beans.provider",
                                                      "net.usikkert.kouinject.beans.collection");

        injector.getBean(DrinkBean.class);
    }
}
