package net.usikkert.kouinject.beans.collection;

import java.util.Collection;

import javax.inject.Inject;

import net.usikkert.kouinject.annotation.Any;
import net.usikkert.kouinject.annotation.Component;

@Component
public class Radio {

    @Inject @Any
    private Collection<RadioListener> radioListeners;

    public Collection<RadioListener> getRadioListeners() {
        return radioListeners;
    }
}
