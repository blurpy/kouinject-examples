package net.usikkert.kouinject.beans;
import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Inject;

@Component
public class SecondBean {

    private final FirstBean firstBean;

    @Inject
    public SecondBean(final FirstBean firstBean) {
        this.firstBean = firstBean;
        System.out.println("SecondBean");
    }

    public FirstBean getFirstBean() {
        return firstBean;
    }
}
