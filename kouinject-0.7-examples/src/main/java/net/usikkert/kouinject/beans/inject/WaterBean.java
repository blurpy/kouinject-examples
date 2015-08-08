package net.usikkert.kouinject.beans.inject;

import net.usikkert.kouinject.annotation.Component;

@Component
public class WaterBean {

    public WaterBean() {
        System.out.println("WaterBean");
    }
}
