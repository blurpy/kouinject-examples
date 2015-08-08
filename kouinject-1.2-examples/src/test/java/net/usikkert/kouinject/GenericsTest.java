package net.usikkert.kouinject;

import static org.junit.Assert.*;

import java.util.Collection;

import net.usikkert.kouinject.beans.generics.Apple;
import net.usikkert.kouinject.beans.generics.AppleBox;
import net.usikkert.kouinject.beans.generics.Box;
import net.usikkert.kouinject.beans.generics.Chocolate;
import net.usikkert.kouinject.beans.generics.ChocolateBox;
import net.usikkert.kouinject.beans.generics.Fruit;
import net.usikkert.kouinject.beans.generics.Orange;
import net.usikkert.kouinject.beans.generics.PlasticBox;
import net.usikkert.kouinject.beans.generics.StorageRoom;
import net.usikkert.kouinject.generics.TypeLiteral;

import org.junit.Test;

/**
 * A test of using generic beans.
 *
 * @author Christian Ihle
 */
public class GenericsTest {

    @Test
    public void correctBeansShouldBeInjectedWhenUsingGenerics() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.generics");

        final StorageRoom storageRoom = injector.getBean(StorageRoom.class);
        assertNotNull(storageRoom);

        final AppleBox appleBox = storageRoom.getAppleBox();
        assertNotNull(appleBox);
        final Apple appleBoxContent = appleBox.getContent();
        assertNotNull(appleBoxContent);

        final Box<Apple> boxOfApple = storageRoom.getBoxOfApple();
        assertNotNull(boxOfApple);
        assertEquals(AppleBox.class, boxOfApple.getClass());
        final Apple boxOfAppleContent = boxOfApple.getContent();
        assertNotNull(boxOfAppleContent);

        final PlasticBox<Apple> plasticBoxOfApple = storageRoom.getPlasticBoxOfApple();
        assertNotNull(plasticBoxOfApple);
        assertEquals(AppleBox.class, plasticBoxOfApple.getClass());
        final Apple plasticBoxOfAppleContent = plasticBoxOfApple.getContent();
        assertNotNull(plasticBoxOfAppleContent);

        final Box<Orange> boxOfOrange = storageRoom.getBoxOfOrange();
        assertNotNull(boxOfOrange);
        assertEquals(PlasticBox.class, boxOfOrange.getClass());
        final Orange boxOfOrangeContent = boxOfOrange.getContent();
        assertNotNull(boxOfOrangeContent);
    }

    @Test
    public void correctBeansShouldBeInjectedWhenUsingWildcardOnACollection() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.generics");

        final StorageRoom storageRoom = injector.getBean(StorageRoom.class);
        assertNotNull(storageRoom);

        final Collection<Box<? extends Fruit>> boxesOfFruit = storageRoom.getBoxesOfFruit();
        assertNotNull(boxesOfFruit);
        assertEquals(2, boxesOfFruit.size());

        boolean foundApple = false;
        boolean foundOrange = false;

        for (final Box<? extends Fruit> box : boxesOfFruit) {
            final Fruit content = box.getContent();

            if (content.getClass().equals(Apple.class)) {
                foundApple = true;
            }

            else if (content.getClass().equals(Orange.class)) {
                foundOrange = true;
            }
        }

        assertTrue(foundApple);
        assertTrue(foundOrange);
    }

    @Test
    public void shouldGetCorrectBeanFromInjectorWhenUsingTypeLiteral() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.generics");

        final Box<Orange> orangeBox = injector.getBean(new TypeLiteral<Box<Orange>>() {});
        assertNotNull(orangeBox);

        final Orange orange = orangeBox.getContent();
        assertNotNull(orange);
    }

    @Test
    public void shouldHandleInjectionIntoTypeVariable() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.generics");

        final ChocolateBox chocolateBox = injector.getBean(ChocolateBox.class);
        assertNotNull(chocolateBox);

        final Chocolate chocolate1 = chocolateBox.getContent();
        final Chocolate chocolate2 = chocolateBox.getContent();

        assertNotSame(chocolate1, chocolate2);
    }

    @Test
    public void shouldSupportGettingACollectionFromAFactory() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.generics");

        final Collection<Fruit> fruitCollection = injector.getBean(new TypeLiteral<Collection<Fruit>>() {});
        assertNotNull(fruitCollection);
        assertEquals(4, fruitCollection.size());

        int numberOfApplesFound = 0;
        int numberOfOrangesFound = 0;

        for (final Fruit fruit : fruitCollection) {
            if (fruit.getClass().equals(Apple.class)) {
                numberOfApplesFound++;
            }

            else if (fruit.getClass().equals(Orange.class)) {
                numberOfOrangesFound++;
            }
        }

        assertEquals(2, numberOfApplesFound);
        assertEquals(2, numberOfOrangesFound);
    }
}
