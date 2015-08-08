package net.usikkert.kouinject.beans.generics;

import java.util.ArrayList;
import java.util.Collection;

import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Produces;

/**
 * A factory that returns collections. Collections returned from factories will override
 * the built-in support for collections in the injector.
 *
 * @author Christian Ihle
 */
@Component
public class CollectionFactory {

    public CollectionFactory() {
        System.out.println("CollectionFactory");
    }

    @Produces
    public Collection<Fruit> createFruitCollection() {
        final Collection<Fruit> fruitCollection = new ArrayList<Fruit>();

        fruitCollection.add(new Apple());
        fruitCollection.add(new Orange());
        fruitCollection.add(new Apple());
        fruitCollection.add(new Orange());

        return fruitCollection;
    }
}
