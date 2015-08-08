package net.usikkert.kouinject.beans;
import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Inject;

@Component
public class ThirdBean {

    @Inject
    private SecondBean secondBean;

    public ThirdBean() {
        System.out.println("ThirdBean");
    }

    public SecondBean getSecondBean() {
        return secondBean;
    }
}
