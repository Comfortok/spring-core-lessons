package task.spring.bean;

import java.util.Map;

public class Developer extends Engineer {

    private Map<String, Integer> yearsInFramework;
    private boolean isCoffeeConsumer;

    public Developer() {
    }

    public Map<String, Integer> getYearsInFramework() {
        return yearsInFramework;
    }

    public void setYearsInFramework(Map<String, Integer> yearsInFramework) {
        this.yearsInFramework = yearsInFramework;
    }

    public boolean getIsCoffeeConsumer() {
        return isCoffeeConsumer;
    }

    public void setIsCoffeeConsumer(boolean isCoffeeConsumer) {
        this.isCoffeeConsumer = isCoffeeConsumer;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "yearsInFramework=" + yearsInFramework +
                ", isCoffeeConsumer=" + isCoffeeConsumer +
                super.toString() +
                '}';
    }
}