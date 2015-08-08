package net.usikkert.kouinject;

import static org.junit.Assert.*;

import net.usikkert.kouinject.beans.scope.PrototypeBean;
import net.usikkert.kouinject.beans.scope.SingletonBean;

import org.junit.Test;

public class ScopeTest {

	@Test
	public void singletonShouldGiveSameInstance() {
		final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.scope");

		final SingletonBean singletonBean1 = injector.getBean(SingletonBean.class);
		assertNotNull(singletonBean1);

		final SingletonBean singletonBean2 = injector.getBean(SingletonBean.class);
		assertNotNull(singletonBean2);

		assertSame(singletonBean1, singletonBean2);
	}

	@Test
	public void prototypeShouldGiveUniqueInstance() {
		final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.scope");

		final PrototypeBean prototypeBean1 = injector.getBean(PrototypeBean.class);
		assertNotNull(prototypeBean1);

		final PrototypeBean prototypeBean2 = injector.getBean(PrototypeBean.class);
		assertNotNull(prototypeBean2);

		assertNotSame(prototypeBean1, prototypeBean2);
	}
}
