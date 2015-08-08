package net.usikkert.kouinject.beans.inject;

import net.usikkert.kouinject.annotation.Component;

@Component
public class TeaBean {

    public TeaBean() {
        System.out.println("TeaBean");
    }
}
