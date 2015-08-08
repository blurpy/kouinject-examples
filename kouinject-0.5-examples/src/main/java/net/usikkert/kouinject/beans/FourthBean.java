package net.usikkert.kouinject.beans;
import net.usikkert.kouinject.annotation.Component;
import net.usikkert.kouinject.annotation.Inject;

@Component
public class FourthBean {

    private ThirdBean thirdBean;

    public FourthBean() {
        System.out.println("FourthBean");
    }

    @Inject
    public void setThirdBean(final ThirdBean thirdBean) {
        this.thirdBean = thirdBean;
    }

    public ThirdBean getThirdBean() {
        return thirdBean;
    }
}
