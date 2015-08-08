package net.usikkert.kouinject;

import static org.junit.Assert.*;

import net.usikkert.kouinject.beans.component.BlogController;
import net.usikkert.kouinject.beans.component.BlogModel;
import net.usikkert.kouinject.beans.component.BlogView;

import org.junit.Test;

/**
 * Test of examples using custom @Components.
 *
 * @author Christian Ihle
 */
public class CustomComponentTest {

    @Test
    public void beansWithCustomComponentAnnotationsShouldBehaveLikeAnyOtherBeans() {
        final Injector injector = new DefaultInjector("net.usikkert.kouinject.beans.component");

        final BlogController blogController = injector.getBean(BlogController.class);
        assertNotNull(blogController);

        final BlogModel blogModel = blogController.getBlogModel();
        assertNotNull(blogModel);

        final BlogView blogView = blogController.getBlogView();
        assertNotNull(blogView);
    }
}
