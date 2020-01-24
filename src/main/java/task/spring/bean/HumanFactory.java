package task.spring.bean;

public class HumanFactory {

    public static Developer createInstance() {
        return new Developer();
    }
}
/*
public class HumanFactory {
    private static Developer dev = new Developer();

    public static Developer createInstance() {
        return dev;
    }
}
*/