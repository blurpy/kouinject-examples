package net.usikkert.kouinject.beans.inject;

import javax.inject.Inject;

import net.usikkert.kouinject.annotation.Component;

@Component
public class ThirdBean {

    @Inject
    private SecondBean secondBean;

    public ThirdBean() {
        System.out.println("ThirdBean");
    }

    public SecondBean getSecondBean() {
        return secondBean;
    }
}
