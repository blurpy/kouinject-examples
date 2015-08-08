package net.usikkert.kouinject.beans.component;

import javax.inject.Inject;

/**
 * A bean using a custom @Component.
 *
 * @author Christian Ihle
 */
@Controller
public class BlogController {

    private BlogView blogView;
    private BlogModel blogModel;

    @Inject
    public BlogController(final BlogView blogView, final BlogModel blogModel) {
        System.out.println("BlogController");
        this.blogView = blogView;
        this.blogModel = blogModel;
    }

    public BlogView getBlogView() {
        return blogView;
    }

    public BlogModel getBlogModel() {
        return blogModel;
    }
}
