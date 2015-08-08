package net.usikkert.kouinject;

import static org.junit.Assert.*;

import net.usikkert.kouinject.DefaultInjector;
import net.usikkert.kouinject.Injector;
import net.usikkert.kouinject.beans.inheritance.RealVanillaYoghurt;
import net.usikkert.kouinject.beans.inheritance.Jens;
import net.usikkert.kouinject.beans.inheritance.VanillaYoghurt;

import org.junit.Test;

public class InheritanceTest {

	@Test
	public void shouldInjectSubclass() {
		final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.inheritance");

		final Jens jens = injector.getBean(Jens.class);
		assertNotNull(jens);

		final VanillaYoghurt vanillaYoghurt = jens.getVanillaYoghurt();
		assertNotNull(vanillaYoghurt);
		assertEquals(RealVanillaYoghurt.class, vanillaYoghurt.getClass());
	}
}
