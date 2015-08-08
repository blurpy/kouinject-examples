package net.usikkert.kouinject.beans.inject;

import javax.inject.Inject;

import net.usikkert.kouinject.annotation.Component;

@Component
public class SecondBean {

	private final FirstBean firstBean;

    @Inject
    public SecondBean(final FirstBean firstBean) {
    	this.firstBean = firstBean;
        System.out.println("SecondBean");
    }

    public FirstBean getFirstBean() {
		return firstBean;
	}
}
