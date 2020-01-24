package task.spring.bean;

public class AutomationTester extends Engineer {

    private String favouriteFramework;
    private boolean isBro;

    public AutomationTester() {
    }

    public String getFavouriteFramework() {
        return favouriteFramework;
    }

    public void setFavouriteFramework(String favouriteFramework) {
        this.favouriteFramework = favouriteFramework;
    }

    public boolean getIsBro() {
        return isBro;
    }

    public void setIsBro(boolean bro) {
        isBro = bro;
    }

    @Override
    public String toString() {
        return "AutomationTester{" +
                "favouriteFramework='" + favouriteFramework + '\'' +
                ", isBro=" + isBro + super.toString() +
                '}';
    }
}
