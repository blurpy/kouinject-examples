package net.usikkert.kouinject.beans.inject;

import javax.inject.Inject;

import net.usikkert.kouinject.annotation.Component;

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
