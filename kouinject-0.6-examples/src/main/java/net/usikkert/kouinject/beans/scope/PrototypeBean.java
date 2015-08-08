package net.usikkert.kouinject.beans.scope;

import net.usikkert.kouinject.annotation.Component;

@Component
public class PrototypeBean {

	public PrototypeBean() {
		System.out.println("PrototypeBean");
	}
}
