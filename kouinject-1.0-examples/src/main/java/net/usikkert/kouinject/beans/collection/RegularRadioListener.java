package net.usikkert.kouinject.beans.collection;

import net.usikkert.kouinject.annotation.Component;

@Component
public class RegularRadioListener implements RadioListener {

    public RegularRadioListener() {
        System.out.println("RegularRadioListener");
    }
}
