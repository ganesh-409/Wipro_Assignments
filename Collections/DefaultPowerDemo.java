interface Power {
    void displayPower();

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

public class DefaultPowerDemo implements Power {
    public void displayPower() {
        System.out.println("Abstract method implementation.");
    }

    public static void main(String[] args) {
        DefaultPowerDemo demo = new DefaultPowerDemo();
        demo.displayPower();
        demo.defaultMethod();
    }
}
