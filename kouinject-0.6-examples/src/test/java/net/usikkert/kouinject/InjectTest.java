package net.usikkert.kouinject;

import static org.junit.Assert.*;

import net.usikkert.kouinject.beans.inject.DrinkBean;
import net.usikkert.kouinject.beans.inject.FirstBean;
import net.usikkert.kouinject.beans.inject.FourthBean;
import net.usikkert.kouinject.beans.inject.SecondBean;
import net.usikkert.kouinject.beans.inject.TeaBean;
import net.usikkert.kouinject.beans.inject.ThirdBean;
import net.usikkert.kouinject.beans.inject.WaterBean;

import org.junit.Test;

public class InjectTest {

	@Test
	public void shouldInjectAllBeans() {
		final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.inject");

		final FourthBean fourthBean = injector.getBean(FourthBean.class);
		assertNotNull(fourthBean);

		final ThirdBean thirdBean = fourthBean.getThirdBean();
		assertNotNull(thirdBean);

		final SecondBean secondBean = thirdBean.getSecondBean();
		assertNotNull(secondBean);

		final FirstBean firstBean = secondBean.getFirstBean();
		assertNotNull(firstBean);
	}

	@Test
    public void shouldInjectSeveralBeansInSameMethod() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.inject");

        final DrinkBean drinkBean = injector.getBean(DrinkBean.class);
        assertNotNull(drinkBean);

        final TeaBean teaBean = drinkBean.getTeaBean();
        assertNotNull(teaBean);

        final WaterBean waterBean = drinkBean.getWaterBean();
        assertNotNull(waterBean);
    }
}
