package net.usikkert.kouinject.beans.generics;

import java.util.Collection;

import javax.inject.Inject;
import net.usikkert.kouinject.annotation.Component;

/**
 * A bean that injects generic beans in different ways.
 *
 * @author Christian Ihle
 */
@Component
public class StorageRoom {

    @Inject
    private AppleBox appleBox;

    @Inject
    private PlasticBox<Apple> plasticBoxOfApple;

    @Inject
    private Box<Apple> boxOfApple;

    @Inject
    private Box<Orange> boxOfOrange;

    @Inject
    private Collection<Box<? extends Fruit>> boxesOfFruit;

    public StorageRoom() {
        System.out.println("StorageRoom");
    }

    public AppleBox getAppleBox() {
        return appleBox;
    }

    public PlasticBox<Apple> getPlasticBoxOfApple() {
        return plasticBoxOfApple;
    }

    public Box<Apple> getBoxOfApple() {
        return boxOfApple;
    }

    public Box<Orange> getBoxOfOrange() {
        return boxOfOrange;
    }

    public Collection<Box<? extends Fruit>> getBoxesOfFruit() {
        return boxesOfFruit;
    }
}
