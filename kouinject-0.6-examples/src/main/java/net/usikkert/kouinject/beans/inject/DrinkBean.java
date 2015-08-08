package net.usikkert.kouinject.beans.inject;

import javax.inject.Inject;

import net.usikkert.kouinject.annotation.Component;

@Component
public class DrinkBean {

    private WaterBean waterBean;

    private TeaBean teaBean;

    public DrinkBean() {
        System.out.println("DrinkBean");
    }

    @Inject
    public void setBeans(final WaterBean waterBean, final TeaBean teaBean) {
        this.waterBean = waterBean;
        this.teaBean = teaBean;
    }

    public TeaBean getTeaBean() {
        return teaBean;
    }

    public WaterBean getWaterBean() {
        return waterBean;
    }
}
