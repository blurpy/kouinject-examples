package net.usikkert.kouinject.beans.inject;

import net.usikkert.kouinject.annotation.Component;

@Component
public class FirstBean {

    public FirstBean() {
        System.out.println("FirstBean");
    }
}
