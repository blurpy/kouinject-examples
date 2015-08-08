package net.usikkert.kouinject;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import net.usikkert.kouinject.AnnotationBasedBeanDataHandler;
import net.usikkert.kouinject.BeanDataHandler;
import net.usikkert.kouinject.BeanLoader;
import net.usikkert.kouinject.ClassLocator;
import net.usikkert.kouinject.ClassPathScanner;
import net.usikkert.kouinject.DefaultBeanLoader;
import net.usikkert.kouinject.beans.FirstBean;
import net.usikkert.kouinject.beans.FourthBean;
import net.usikkert.kouinject.beans.SecondBean;
import net.usikkert.kouinject.beans.ThirdBean;

public class BeanTest {

    private BeanLoader beanLoader;

    @Before
    public void createInjector() {
        final ClassLocator classLocator = new ClassPathScanner();
        final BeanDataHandler beanDataHandler = new AnnotationBasedBeanDataHandler("net.usikkert.kouinject.beans", classLocator);
        beanLoader = new DefaultBeanLoader(beanDataHandler);
        beanLoader.loadBeans();
    }

    @Test
    public void verifyInjections() {
        final FourthBean fourthBean = beanLoader.getBean(FourthBean.class);
        assertNotNull(fourthBean);

        final ThirdBean thirdBean = fourthBean.getThirdBean();
        assertNotNull(thirdBean);

        final SecondBean secondBean = thirdBean.getSecondBean();
        assertNotNull(secondBean);

        final FirstBean firstBean = secondBean.getFirstBean();
        assertNotNull(firstBean);
    }
}
