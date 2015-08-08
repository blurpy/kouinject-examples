package net.usikkert.kouinject.beans.scope;

import javax.inject.Singleton;

import net.usikkert.kouinject.annotation.Component;

@Singleton
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("SingletonBean");
    }
}
