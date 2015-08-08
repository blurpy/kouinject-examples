package net.usikkert.kouinject;

import static org.junit.Assert.*;

import net.usikkert.kouinject.beans.qualifier.Car;
import net.usikkert.kouinject.beans.qualifier.Ford;
import net.usikkert.kouinject.beans.qualifier.Garage;
import net.usikkert.kouinject.beans.qualifier.Subaru;

import org.junit.Test;

public class QualifierTest {

	@Test
	public void shouldInjectCorrectType() {
		final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.qualifier");

		final Garage garage = injector.getBean(Garage.class);
		assertNotNull(garage);

		final Car familyCar = garage.getFamilyCar();
		assertNotNull(familyCar);
		assertEquals(Ford.class, familyCar.getClass());

		final Car sportyCar = garage.getSportyCar();
		assertNotNull(sportyCar);
		assertEquals(Subaru.class, sportyCar.getClass());
	}
}
