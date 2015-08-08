package net.usikkert.kouinject.beans.provider;

import javax.inject.Inject;
import javax.inject.Provider;

import net.usikkert.kouinject.annotation.Component;

@Component
public class Salad {

    @Inject
    private Provider<Cucumber> cucumberProvider;

    public Salad() {
        System.out.println("Salad");
    }

    public Provider<Cucumber> getCucumberProvider() {
        return cucumberProvider;
    }
}
