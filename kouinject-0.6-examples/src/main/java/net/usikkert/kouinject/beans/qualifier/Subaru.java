package net.usikkert.kouinject.beans.qualifier;

import net.usikkert.kouinject.annotation.Component;

@Sporty
@Component
public class Subaru implements Car {

	public Subaru() {
		System.out.println("Subaru");
	}
}
